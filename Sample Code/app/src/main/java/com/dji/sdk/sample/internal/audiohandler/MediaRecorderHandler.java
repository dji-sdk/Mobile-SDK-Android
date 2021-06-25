package com.dji.sdk.sample.internal.audiohandler;

import android.media.MediaRecorder;

import com.dji.sdk.sample.internal.utils.Helper;

import java.io.File;

/**
 * A class for saving the compressed file after recording
 */
public class MediaRecorderHandler {

    private MediaRecorder mediaRecorder;
    private String fileSavePath;
    private String fileName;
    private String fileAbsolutePath;
    private MediaRecorderOptions options;
    private boolean isRecording;


    public MediaRecorderHandler(String savePath, MediaRecorderOptions options) {
        fileSavePath = savePath;
        this.options = options;
        File file = new File(fileSavePath);
        if (!file.exists()) {
            file.mkdirs();
        }

    }

    /**
     * start recording the audio info and save as a file.
     */
    public synchronized void startRecord() {
        try {
            if (!isRecording) {
                mediaRecorder = new MediaRecorder();
                this.fileName = generateFileName();
                File file = new File(fileSavePath, fileName);
                fileAbsolutePath = file.getAbsolutePath();
                mediaRecorder.setOutputFile(fileAbsolutePath);
                mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                //TODO: Can set any encoder you needed here.
                mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.AAC_ADTS);
                mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
                mediaRecorder.setAudioEncodingBitRate(options.getAudioEncodingBitRate());
                mediaRecorder.setAudioChannels(options.getAudioChannels());
                mediaRecorder.setAudioSamplingRate(options.getAudioSamplingRate());
                mediaRecorder.prepare();
                mediaRecorder.start();
                isRecording = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Stop recording and release the resources.
     */
    public synchronized void stopAndRelease() {
        if (isRecording) {
            if (mediaRecorder == null) {
                return;
            }
            mediaRecorder.stop();
            mediaRecorder.release();
            mediaRecorder = null;
            isRecording = false;
        }
    }

    public void cancel() {
        this.stopAndRelease();
        if (fileAbsolutePath != null) {
            File file = new File(fileAbsolutePath);
            file.delete();
            fileAbsolutePath = null;


        }
    }

    private String generateFileName() {
        return Helper.timeStamp2Date(null);
    }

    public String getFileName() {
        return fileName;
    }

    public boolean isRecording() {
        return isRecording;
    }

    public String getCurrentFilePath() {
        return fileAbsolutePath;
    }
}
