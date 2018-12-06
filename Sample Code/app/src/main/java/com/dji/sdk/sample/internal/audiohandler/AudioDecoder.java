package com.dji.sdk.sample.internal.audiohandler;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * A class for extracting the PCM data from the compressed file.
 */
public class AudioDecoder {

    private static final String TAG = "AudioDecoder";
    private MediaCodec mediaDecoder;
    private MediaExtractor mediaExtractor;
    private ByteBuffer[] decodeInputBuffers;
    private ByteBuffer[] decodeOutputBuffers;
    private MediaCodec.BufferInfo decodeBufferInfo;
    private DecodeProgressListener decodeProgressListener;
    private long decodeSize;
    private boolean codeOver = false;
    private int currentSDKVersion = Build.VERSION.SDK_INT;

    public AudioDecoder() {
    }

    /**
     * Init the media decoder
     */
    public void initMediaDecoder(String srcPath, DecodeProgressListener listener) {
        if (srcPath == null) {
            throw new IllegalArgumentException("srcPath can't be null");
        }
        codeOver = false;
        this.decodeProgressListener = listener;
        try {
            //Extract the audio track from the media file.
            mediaExtractor=new MediaExtractor();
            //Set the data source with the file path
            mediaExtractor.setDataSource(srcPath);

            for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                MediaFormat format = mediaExtractor.getTrackFormat(i);
                String mime = format.getString(MediaFormat.KEY_MIME);
                //Get the audio track
                if (mime.startsWith("audio")) {
                    //Select current track
                    mediaExtractor.selectTrack(i);
                    //Create media decoder.
                    mediaDecoder = MediaCodec.createDecoderByType(mime);
                    mediaDecoder.configure(format, null, null, 0);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (mediaDecoder == null) {
            Log.e(TAG, "create mediaDecoder failed");
            return;
        }
        //Start mediaCodec, waiting the input buffers
        mediaDecoder.start();
        //Get the input buffers by mediaCodec in this ByteBuffer array.
        decodeInputBuffers= mediaDecoder.getInputBuffers();
        //Put the decoded output buffers in decodeOutputBuffers
        decodeOutputBuffers= mediaDecoder.getOutputBuffers();
        //Describe the info of the output byte.
        decodeBufferInfo=new MediaCodec.BufferInfo();
    }

    /**
     * Start Decoding
     */
    public void startDecoding() {
        notifyDecodeStarted();
        new Thread(new DecodeRunnable()).start();

    }

    public void release() {

        codeOver = true;
        if (mediaDecoder != null) {
            mediaDecoder.stop();
            mediaDecoder.release();
            mediaDecoder = null;
        }

        if (mediaExtractor != null) {
            mediaExtractor.release();
            mediaExtractor = null;
        }

        if (decodeProgressListener != null) {
            decodeProgressListener = null;
        }
    }

    public interface DecodeProgressListener {

        void onStarted();

        void onProgress(byte[] data);

        void onCompleted();

    }

    private class DecodeRunnable implements Runnable {

        @Override
        public void run() {
            while (!codeOver) {
                try {
                    decodeAudioMediaFileToPCMStream();
                } catch (Exception e) {

                }
            }
        }
    }

    private void decodeAudioMediaFileToPCMStream() {
        for (int i = 0; i < decodeInputBuffers.length - 1; i++) {
            int inputIndex = mediaDecoder.dequeueInputBuffer(-1);
            if (inputIndex < 0) {
                codeOver = true;
                notifyDecodeCompleted();
                return;
            }

            ByteBuffer inputBuffer;
            if (currentSDKVersion >= Build.VERSION_CODES.LOLLIPOP && mediaDecoder != null) {
                inputBuffer = mediaDecoder.getInputBuffer(inputIndex);
            } else {
                inputBuffer = decodeInputBuffers[inputIndex];
            }

            inputBuffer.clear();
            int sampleSize = mediaExtractor.readSampleData(inputBuffer, 0);
            if (sampleSize < 0) {
                codeOver = true;
                notifyDecodeCompleted();
                return;
            } else {
                mediaDecoder.queueInputBuffer(inputIndex, 0, sampleSize, 0, 0);
                mediaExtractor.advance();
                decodeSize += sampleSize;
            }
        }

        int outputIndex = mediaDecoder.dequeueOutputBuffer(decodeBufferInfo, 10000);

        ByteBuffer outputBuffer;
        byte[] chunkPCM;
        while (outputIndex >= 0) {
            if (currentSDKVersion >= Build.VERSION_CODES.LOLLIPOP) {
                outputBuffer = mediaDecoder.getOutputBuffer(outputIndex);
            } else {
                outputBuffer = decodeOutputBuffers[outputIndex];
            }
            chunkPCM = new byte[decodeBufferInfo.size];
            outputBuffer.get(chunkPCM);
            outputBuffer.clear();
            notifyDecodeOnProgress(chunkPCM);
            mediaDecoder.releaseOutputBuffer(outputIndex, false);
            outputIndex = mediaDecoder.dequeueOutputBuffer(decodeBufferInfo, 10000);
        }
    }

    private void notifyDecodeStarted() {
        if (this.decodeProgressListener != null) {
            this.decodeProgressListener.onStarted();
        }
    }

    private void notifyDecodeCompleted() {
        if (this.decodeProgressListener != null) {
            this.decodeProgressListener.onCompleted();
        }
    }

    private void notifyDecodeOnProgress(byte[] data) {
        if (this.decodeProgressListener != null) {
            this.decodeProgressListener.onProgress(data);
        }
    }

}
