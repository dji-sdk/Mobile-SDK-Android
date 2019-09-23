package com.dji.sdk.sample.internal.view;

import android.content.Context;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.DialogUtils;

public class StartRedirectGoAcitivityView extends LinearLayout implements PresentableView{

    @Override
    public int getDescription() {
        return R.string.component_listview_redirect_to_djigo;
    }
    public StartRedirectGoAcitivityView(Context context) {
        super(context);
        init(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    private void init(final Context context) {
        setOrientation(LinearLayout.VERTICAL);
        setGravity(Gravity.CENTER);
        setClickable(false);
        Button startGo4 = new Button(new ContextThemeWrapper(context, R.style.button_style));
        startGo4.setBackground(context.getResources().getDrawable(R.drawable.round_btn));
        startGo4.setText(R.string.component_listview_redirect_go4);
        startGo4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getContext().getPackageManager().getLaunchIntentForPackage("dji.go.v4");
                if (launchIntent != null) {
                    getContext().startActivity(launchIntent);//null pointer check in case package name was not found
                } else {
                    DialogUtils.showDialog(getContext(),
                            getResources()
                                    .getString(
                                            R.string.component_listview_redirect_go4_failure));
                }
            }
        });

        Button startGo = new Button(new ContextThemeWrapper(context, R.style.button_style));

        startGo.setText(R.string.component_listview_redirect_go);
        startGo.setBackground(context.getResources().getDrawable(R.drawable.round_btn));
        startGo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getContext().getPackageManager().getLaunchIntentForPackage("dji.pilot");
                if (launchIntent != null) {
                    getContext().startActivity(launchIntent);//null pointer check in case package name was not found
                }else {
                    DialogUtils.showDialog(getContext(),
                            getResources()
                                    .getString(
                                            R.string.component_listview_redirect_go_failure));
                }
            }
        });

        this.addView(startGo4);
        this.addView(startGo);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(startGo.getLayoutParams());
        lp.setMargins(0, 100, 0, 0);
        startGo.setLayoutParams(lp);
    }

}
