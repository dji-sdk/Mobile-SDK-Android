package com.dji.sdk.sample.internal.audiohandler;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import dji.thirdparty.afinal.core.AsyncTask;
import java.io.File;

public class AudioRecorderHandler {

    private static int MAX_DATA_LENGTH = 160;
    private AudioRecord audioRecord;
    private boolean isRecording = false;
    private int frequence = 44100;
    private int channelInConfig = AudioFormat.CHANNEL_IN_MONO;
    private int audioEncoding = AudioFormat.ENCODING_PCM_16BIT;
    private short[] buffer = null;
    private File lastCacheFile = null;

    public AudioRecorderHandler(Context context) {
        if (context == null) {
            throw new RuntimeException("Context could not be null!");
        }
    }

    public void startRecord(AudioRecordingCallback audioRecordingCallback) {
        RecordTask task = new RecordTask(audioRecordingCallback);
        task.execute();
    }


    public void stopRecord() {
        isRecording = false;
    }


    public boolean deleteLastRecordFile() {
        boolean success = false;
        if (lastCacheFile != null && lastCacheFile.exists()) {
            success = lastCacheFile.delete();
        }
        return success;
    }


    private class RecordTask extends AsyncTask<String, Integer, String> {

        private AudioRecordingCallback audioRecordingCallback = null;

        public RecordTask(AudioRecordingCallback audioRecordingCallback) {
            this.audioRecordingCallback = audioRecordingCallback;
        }

        @Override
        protected void onPreExecute() {
            int bufferSize = AudioRecord.getMinBufferSize(frequence,
                                                          channelInConfig, audioEncoding);
            if (audioRecord == null) {
                audioRecord = new AudioRecord(MediaRecorder.AudioSource.MIC,
                        frequence, channelInConfig, audioEncoding, bufferSize);
            }

            buffer = new short[bufferSize];
            audioRecord.startRecording();
            isRecording = true;
        }

        @Override
        protected void onPostExecute(String result) {
            //audioRecord = null;
            if (result == null) {
                lastCacheFile = null;
            } else {
                lastCacheFile = new File(result);
            }
            if (audioRecordingCallback != null) {
                audioRecordingCallback.onStopRecord(result);
            }
        }

        @Override
        protected String doInBackground(String... params) {
            String tempFileName = null;
            while (isRecording) {
                int result = audioRecord.read(buffer, 0, buffer.length);
                if (audioRecordingCallback != null) {
                    byte[] audio = new byte[result*2];
                    int index = 0;
                    byte[] shortToByte = null;
                    for (int i = 0; i < result; i++) {
                        shortToByte = getBytes(buffer[i]);
                        System.arraycopy(shortToByte, 0, audio, index, shortToByte.length);
                        index += shortToByte.length;
                    }

                    if (shortToByte != null && shortToByte.length > 0) {
                        audioRecordingCallback.onRecording(audio);
                    }

                }

            }

            if (audioRecord != null) {
                audioRecord.stop();
            }
            return tempFileName;
        }
    }

    public interface AudioRecordingCallback {

        void onRecording(byte[] data);


        void onStopRecord(String savedPath);
    }

    public void release() {
        if (audioRecord != null) {
            audioRecord.release();
            audioRecord = null;
        }

    }

    public static byte[] getBytes(short data) {
        byte[] bytes = new byte[2];
        bytes[0] = (byte) (data & 0xff);
        bytes[1] = (byte) ((data & 0xff00) >> 8);
        return bytes;
    }
}
