package com.dji.sdk.sample.demo.useraccount;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import dji.common.error.DJIError;
import dji.common.useraccount.UserAccountState;
import dji.common.util.CommonCallbacks;
import dji.sdk.useraccount.UserAccountManager;

/**
 * View that can be added to any view that requires the user to be logged in
 */

public class LoginView extends LinearLayout implements View.OnClickListener {

    private TextView accountStateTV;
    private Button loginBtn;
    private Button logoutBtn;

    public LoginView(Context context) {
        super(context);
        init();
    }

    public LoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LoginView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_login:
                // Launches a login dialog
                UserAccountManager.getInstance().logIntoDJIUserAccount(this.getContext(),
                    new CommonCallbacks.CompletionCallbackWith<UserAccountState>() {
                        @Override
                        public void onSuccess(UserAccountState userAccountState) {
                            ToastUtils.setResultToToast("Login Success");
                            updateLoginState(userAccountState);
                        }

                        @Override
                        public void onFailure(DJIError djiError) {
                            ToastUtils.setResultToToast("error:" + djiError.getDescription());
                        }
                    });

                break;
            case R.id.btn_login_out:
                // Logs out the current user
                UserAccountManager.getInstance().logoutOfDJIUserAccount(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null == error) {
                            ToastUtils.setResultToToast("Logout Success");
                            updateLoginState(UserAccountState.NOT_LOGGED_IN);
                        } else {
                            ToastUtils.setResultToToast("error:" + error.getDescription());
                        }
                    }
                });
                break;
            default:
                break;
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        UserAccountState currentState = UserAccountManager.getInstance().getUserAccountState();
        updateLoginState(currentState);
    }

    // After the user logs in or out, update the enabled state of the buttons
    private void updateLoginState(final UserAccountState userAccountState) {
        ToastUtils.setResultToText(accountStateTV, "Account State: " + userAccountState);
        post(new Runnable() {
            @Override
            public void run() {
                loginBtn.setEnabled(userAccountState != UserAccountState.AUTHORIZED);
                logoutBtn.setEnabled(userAccountState != UserAccountState.NOT_LOGGED_IN);
            }
        });
    }

    private void init() {
        setOrientation(VERTICAL);
        inflate(getContext(), R.layout.view_login, this);

        loginBtn = (Button) findViewById(R.id.btn_login);
        logoutBtn = (Button) findViewById(R.id.btn_login_out);
        loginBtn.setOnClickListener(this);
        logoutBtn.setOnClickListener(this);
        accountStateTV = (TextView) findViewById(R.id.tv_account_state_info);
    }
}
