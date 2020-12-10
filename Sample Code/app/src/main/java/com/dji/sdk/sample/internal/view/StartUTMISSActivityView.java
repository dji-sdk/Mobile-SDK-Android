package com.dji.sdk.sample.internal.view;

import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.demo.utmiss.UTMISSActivity;

/**
 * Created on 2020/3/20.
 *
 * @author
 */
public class StartUTMISSActivityView extends LinearLayout implements PresentableView {

    public StartUTMISSActivityView(Context context) {
        super(context);
        context.startActivity(new Intent(context, UTMISSActivity.class));
        setGravity(Gravity.CENTER);
        TextView tv = new TextView(context);
        tv.setText("Press the back key to return");
        tv.setTextSize(20);
        this.addView(tv);
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_utmiss;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
