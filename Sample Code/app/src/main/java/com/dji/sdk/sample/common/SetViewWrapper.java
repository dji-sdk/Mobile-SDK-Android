package com.dji.sdk.sample.common;

import android.app.Service;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

public class SetViewWrapper {

    public static final String TAG = SetViewWrapper.class.getName();

    private int mTitleId;
    private View mView;

    public SetViewWrapper(int layoutId, int titleId, Context ctx) {
        LayoutInflater layoutInflater = (LayoutInflater)
                        ctx.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        Log.v(TAG, ctx.getString(titleId));
        mView = layoutInflater.inflate(layoutId, null, false);
        mTitleId = titleId;
    }

    public SetViewWrapper(View layoutView, int titleId) {
        mView = layoutView;
        mTitleId = titleId;
    }

    public int getTitleId() {
        return mTitleId;
    }

    public View getView() {
        return mView;
    }

    public static class Remove {
        private View mView;

        public Remove(View v) {
            mView = v;
        }

        public View getView() {
            return mView;
        }
    }
}
