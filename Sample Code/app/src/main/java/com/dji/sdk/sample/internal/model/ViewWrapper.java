package com.dji.sdk.sample.internal.model;

import android.view.View;

public class ViewWrapper {

    private final int titleId;
    private final View view;

    public ViewWrapper(View layoutView, int titleId) {
        view = layoutView;
        this.titleId = titleId;
    }

    public int getTitleId() {
        return titleId;
    }

    public View getView() {
        return view;
    }
}
