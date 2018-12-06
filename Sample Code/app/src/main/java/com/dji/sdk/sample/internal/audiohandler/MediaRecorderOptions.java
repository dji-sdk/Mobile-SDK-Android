package com.dji.sdk.sample.internal.audiohandler;

public class MediaRecorderOptions {

    private Builder mBuilder;
    private MediaRecorderOptions(Builder builder) {
        mBuilder = builder;
    }

    public int getAudioSamplingRate() {
        return mBuilder.mAudioSamplingRate;
    }

    public int getAudioEncodingBitRate() {
        return mBuilder.mAudioEncodingBitRate;
    }

    public int getAudioChannels() {
        return mBuilder.mAudioChannels;
    }

    public static class Builder {
        int mAudioSamplingRate;
        int mAudioEncodingBitRate;
        int mAudioChannels;

        public Builder() {
            mAudioSamplingRate = 44100;
            mAudioEncodingBitRate = 16000;
            mAudioChannels = 1;
        }

        public Builder audioSamplingRate(int rate) {
            mAudioSamplingRate = rate;
            return this;
        }

        public Builder audioEncodingBitRate(int audioEncodingBitRate) {
            mAudioEncodingBitRate = audioEncodingBitRate;
            return this;
        }

        public Builder audioChannels(int audioChannels) {
            mAudioChannels = audioChannels;
            return this;
        }

        public MediaRecorderOptions build() {
            return new MediaRecorderOptions(this);
        }
    }
}
