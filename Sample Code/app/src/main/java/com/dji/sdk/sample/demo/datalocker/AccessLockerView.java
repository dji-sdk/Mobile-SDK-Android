package com.dji.sdk.sample.demo.datalocker;

import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.error.DJIError;
import dji.common.flightcontroller.accesslocker.AccessLockerState;
import dji.common.flightcontroller.accesslocker.FormattingState;
import dji.common.flightcontroller.accesslocker.UserAccountInfo;
import dji.common.util.CommonCallbacks;
import dji.sdk.base.BaseProduct;
import dji.sdk.flightcontroller.AccessLocker;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.products.Aircraft;

public class AccessLockerView extends LinearLayout implements View.OnClickListener, PresentableView {

    protected Button setUpUserAccountBtn;
    protected Button loginBtn;
    protected Button resetUserAccountBtn;
    protected Button modifyUserAccountBtn;
    protected Button formatBtn;
    protected Button getUserAccountBtn;
    protected Button getVersionBtn;

    protected TextView accessLockerStateTV;
    protected TextView accessFormattingStateTV;

    private AccessLocker accessLocker;

    public AccessLockerView(Context context) {
        super(context);
        initUI(context);
    }

    public AccessLockerView(Context context, @Nullable AttributeSet attrs) {
        super(context);
        initUI(context);
    }

    public AccessLockerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context);
        initUI(context);
    }

    private void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_access_locker, this, true);

        accessLockerStateTV = (TextView) findViewById(R.id.tv_access_locker_state);
        accessFormattingStateTV = (TextView) findViewById(R.id.tv_access_formatting_state);
        setUpUserAccountBtn = (Button) findViewById(R.id.btn_set_up_user_account);
        loginBtn = (Button) findViewById(R.id.btn_login);
        resetUserAccountBtn = (Button) findViewById(R.id.btn_reset_user_account);
        modifyUserAccountBtn = (Button) findViewById(R.id.btn_modify_user_account);
        formatBtn = (Button) findViewById(R.id.btn_format);
        getUserAccountBtn = (Button) findViewById(R.id.btn_get_user_account);
        getVersionBtn = (Button) findViewById(R.id.btn_get_version);

        setUpUserAccountBtn.setOnClickListener(this);
        loginBtn.setOnClickListener(this);
        resetUserAccountBtn.setOnClickListener(this);
        modifyUserAccountBtn.setOnClickListener(this);
        formatBtn.setOnClickListener(this);
        getUserAccountBtn.setOnClickListener(this);
        getVersionBtn.setOnClickListener(this);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initAccessLocker();
        initAccessLockerListener();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (accessLocker != null) {
            accessLocker.setAccessLockerStateCallback(null);
            accessLocker.setFormattingStateCallback(null);
            accessLocker = null;
        }
    }

    private void initAccessLocker() {

        BaseProduct product = DJISampleApplication.getProductInstance();

        if (product == null || !product.isConnected() || !(product instanceof Aircraft)) {
            ToastUtils.setResultToToast("Disconnect");
            accessLocker = null;
            return;
        }

        FlightController flightController = ((Aircraft) product).getFlightController();
        if (flightController == null) {
            ToastUtils.setResultToToast("Disconnect");
            accessLocker = null;
            return;
        }

        accessLocker = flightController.getAccessLocker();
        if (accessLocker == null) {
            ToastUtils.setResultToToast("The product do not support access locker!");
            return;
        }
    }

    private void initAccessLockerListener() {
        if (accessLocker != null) {

            updateAccessLockerState();
            accessLocker.setAccessLockerStateCallback(new AccessLockerState.Callback() {
                @Override
                public void onUpdate(AccessLockerState state) {
                    updateAccessLockerState();
                }
            });

            accessLocker.setFormattingStateCallback(new FormattingState.Callback() {
                @Override
                public void onUpdate(FormattingState state) {
                    updateFormattingState(state);
                }
            });
        }
    }

    private void updateAccessLockerState() {
        AccessLockerState accessLockerState = AccessLockerState.UNKNOWN;
        if (accessLocker != null) {
            accessLockerState = accessLocker.getState();
        }
        showAccessLockerStateText(accessLockerState.name());
    }

    private void updateFormattingState(FormattingState state) {
        if (state != null) {
            final StringBuilder sb = new StringBuilder();
            String formattingState = sb.append(state.getProgressState())
                                       .append('\n')
                                       .append("error:")
                                       .append(state.getDJIDataLockerError())
                                       .toString();
            showFormattingStateText(formattingState);
        }
    }

    private void showFormattingStateText(final String s) {
        post(new Runnable() {
            @Override
            public void run() {
                if (accessFormattingStateTV == null) {
                    Toast.makeText(getContext(), "textview = null", Toast.LENGTH_SHORT).show();
                } else {
                    accessFormattingStateTV.setText(s + "\n");
                }
            }
        });
    }

    private void showAccessLockerStateText(final String s) {

        post(new Runnable() {
            @Override
            public void run() {
                if (accessLockerStateTV == null) {
                    Toast.makeText(getContext(), "textview = null", Toast.LENGTH_SHORT).show();
                } else {
                    accessLockerStateTV.setText(s + "\n");
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get_user_account:
                getUserAccount();
                break;
            case R.id.btn_get_version:
                getVersion();
                break;
            case R.id.btn_set_up_user_account:
                setUpUserAccount();
                break;
            case R.id.btn_login:
                login();
                break;
            case R.id.btn_reset_user_account:
                resetUserAccount();
                break;
            case R.id.btn_modify_user_account:
                modifyUserAccount();
                break;
            case R.id.btn_format:
                format();
                break;
            default:
                break;
        }
    }

    private void getUserAccount() {
        if (accessLocker != null) {
            accessLocker.getUserAccount(new CommonCallbacks.CompletionCallbackWith<String>() {
                @Override
                public void onSuccess(String s) {
                    ToastUtils.setResultToToast("Success!" + s);
                }

                @Override
                public void onFailure(DJIError djiError) {
                    ToastUtils.setResultToToast("Failed!" + djiError.getDescription());
                }
            });
        } else {
            ToastUtils.setResultToToast("Disconnect");
        }
    }

    private void getVersion() {
        if (accessLocker != null) {
            accessLocker.getVersion(new CommonCallbacks.CompletionCallbackWith<Integer>() {
                @Override
                public void onSuccess(Integer integer) {
                    ToastUtils.setResultToToast("Success!" + integer);
                }

                @Override
                public void onFailure(DJIError djiError) {
                    ToastUtils.setResultToToast("Failed!" + djiError.getDescription());
                }
            });
        } else {
            ToastUtils.setResultToToast("Disconnect");
        }
    }

    private void setUpUserAccount() {
        if (accessLocker != null) {
            createDialog(new AccessLockerSettingsListener() {
                @Override
                public void onResult(UserAccountInfo info, UserAccountInfo newInfo) {
                    accessLocker.setUpUserAccount(info, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError error) {
                            ToastUtils.setResultToToast(error == null ? "Success!" : error.getDescription());
                        }
                    });
                }
            }, false);
        } else {
            ToastUtils.setResultToToast("Disconnect");
        }
    }

    private void login() {
        if (accessLocker != null) {
            createDialog(new AccessLockerSettingsListener() {
                @Override
                public void onResult(UserAccountInfo info, UserAccountInfo newInfo) {
                    accessLocker.login(info, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError error) {
                            ToastUtils.setResultToToast(error == null ? "Success!" : error.getDescription());
                        }
                    });
                }
            }, false);
        } else {
            ToastUtils.setResultToToast("Disconnect");
        }
    }

    private void resetUserAccount() {
        if (accessLocker != null) {
            createDialog(new AccessLockerSettingsListener() {
                @Override
                public void onResult(UserAccountInfo info, UserAccountInfo newInfo) {
                    accessLocker.resetUserAccount(info, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError error) {
                            ToastUtils.setResultToToast(error == null ? "Success!" : error.getDescription());
                        }
                    });
                }
            }, false);
        } else {
            ToastUtils.setResultToToast("Disconnect");
        }
    }

    private void modifyUserAccount() {
        if (accessLocker != null) {
            createDialog(new AccessLockerSettingsListener() {
                @Override
                public void onResult(UserAccountInfo info, UserAccountInfo newInfo) {
                    accessLocker.modifyUserAccount(info, newInfo, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError error) {
                            ToastUtils.setResultToToast(error == null ? "Success!" : error.getDescription());
                        }
                    });
                }
            }, true);
        } else {
            ToastUtils.setResultToToast("Disconnect");
        }
    }

    private void format() {
        if (accessLocker != null) {

            accessLocker.format(new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError error) {
                    ToastUtils.setResultToToast(error == null ? "Success!" : error.getDescription());
                }
            });
        } else {
            ToastUtils.setResultToToast("Disconnect");
        }
    }

    private void createDialog(final AccessLockerSettingsListener listener, final boolean isModifyUserAccount) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View longinDialogView = layoutInflater.inflate(R.layout.dialog_username_password, null);
        final EditText usernameET = (EditText) longinDialogView.findViewById(R.id.et_username);
        final EditText securityCodeET = (EditText) longinDialogView.findViewById(R.id.et_security_code);
        TextView newSecurityCodeTV = (TextView) longinDialogView.findViewById(R.id.tv_new_security_code);
        final EditText newSecurityCodeET = (EditText) longinDialogView.findViewById(R.id.et_new_security_code);
        TextView newAccountTV = (TextView) longinDialogView.findViewById(R.id.tv_new_account);
        final EditText newAccountET = (EditText) longinDialogView.findViewById(R.id.et_new_account);
        usernameET.setInputType(InputType.TYPE_CLASS_TEXT);
        securityCodeET.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        securityCodeET.setTransformationMethod(PasswordTransformationMethod.getInstance());
        newSecurityCodeET.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        newSecurityCodeET.setTransformationMethod(PasswordTransformationMethod.getInstance());
        newAccountET.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        newAccountET.setTransformationMethod(PasswordTransformationMethod.getInstance());
        if (isModifyUserAccount) {
            newAccountTV.setVisibility(View.VISIBLE);
            newAccountET.setVisibility(View.VISIBLE);
            newSecurityCodeTV.setVisibility(View.VISIBLE);
            newSecurityCodeET.setVisibility(View.VISIBLE);
        }

        new AlertDialog.Builder(getContext()).setTitle("Username and Code")
                                             .setView(longinDialogView)
                                             .setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                                                 @Override
                                                 public void onClick(DialogInterface dialog, int which) {
                                                     if (!isModifyUserAccount) {
                                                         listener.onResult(new UserAccountInfo(usernameET.getText()
                                                                                                         .toString(),
                                                                                               securityCodeET.getText()
                                                                                                             .toString()),
                                                                           null);
                                                     } else {
                                                         listener.onResult(new UserAccountInfo(usernameET.getText()
                                                                                                         .toString(),
                                                                                               securityCodeET.getText()
                                                                                                             .toString()),
                                                                           new UserAccountInfo(newAccountET.getText()
                                                                                                           .toString(),
                                                                                               newSecurityCodeET.getText()
                                                                                                                .toString()));
                                                     }
                                                 }
                                             })
                                             .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                                                 @Override
                                                 public void onClick(DialogInterface dialog, int which) {

                                                 }
                                             })
                                             .show();
    }

    interface AccessLockerSettingsListener {

        void onResult(UserAccountInfo currentUserInfo, UserAccountInfo newUserInfo);
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_access_locker;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}