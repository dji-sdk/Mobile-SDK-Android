package com.dji.sdk.sample.demo.utmiss;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.dji.sdk.sample.R;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dji.common.error.DJIError;
import dji.sdk.utmiss.UTMISSFlightDataUploadStatus;
import dji.sdk.utmiss.UTMISSManager;
import dji.sdk.utmiss.UTMISSParam;

import static com.dji.sdk.sample.internal.utils.ToastUtils.showToast;

public class UTMISSActivity extends AppCompatActivity {

    @BindView(R.id.txt_db_path)
    TextView mTvDbPath;
    @BindView(R.id.txt_status)
    TextView mTvStatus;
    @BindView(R.id.txt_info)
    TextView mTvInfo;

    @BindView(R.id.edt_token_key)
    EditText mEdtTokenKey;
    @BindView(R.id.edt_manufactureId)
    EditText mEdtManufactureId;
    @BindView(R.id.edt_uasId)
    EditText mEdtUasId;

    @BindView(R.id.btn_start)
    Button mBtnInit;

    String dbPath;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utmiss);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        File file = getExternalFilesDir(null);
        if (file == null) {
            showToast("dbPath dir create failed!");
        } else {
            dbPath = file.getAbsolutePath() + File.separator + "utmiss";
            file = new File(dbPath);
            if (!file.exists() && !file.mkdirs()) {
                showToast("dbPath dir create failed!");
            }
        }
        mTvDbPath.setText(String.format("db path->%s\nlog path->%s", dbPath, UTMISSManager.getInstance().getUtmissLogPath()));
        mEdtManufactureId.setText("test");
        mEdtUasId.setText("UAS-DEFAULT");
        UTMISSFlightDataUploadStatus uploadStatus = UTMISSManager.getInstance().getUploadStatus();
        mTvStatus.setText(String.format("current status is %s", uploadStatus.toString()));
        if (uploadStatus != UTMISSFlightDataUploadStatus.UNKNOWN) {
            changeUI();
        }
    }


    @OnClick({R.id.btn_start, R.id.btn_stop})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start:
                start();
                break;
            case R.id.btn_stop:
                stop();
                break;
            default:
                throw new IllegalArgumentException("some btn click not implementation!");
        }
    }

    private void stop() {
        UTMISSManager.getInstance().stopToUpload();
        changeInitBtnState(true);
    }


    private void start() {
        String tokenKey = mEdtTokenKey.getText().toString().trim();
        if (TextUtils.isEmpty(tokenKey)) {
            showToast("pls enter token key first");
            return;
        }

        String manufactureId = mEdtManufactureId.getText().toString().trim();
        if (TextUtils.isEmpty(manufactureId)) {
            showToast("pls enter manufactureId first");
            return;
        }

        String uasId = mEdtManufactureId.getText().toString().trim();
        if (TextUtils.isEmpty(uasId)) {
            showToast("pls enter uasId first");
            return;
        }

        UTMISSParam utmissParam = new UTMISSParam(dbPath, tokenKey, manufactureId, uasId);
        DJIError error = UTMISSManager.getInstance().startToUpload(utmissParam);
        if (error == null) {
            changeUI();
        } else {
            showToast(error.getDescription());
        }
    }

    private void changeUI() {
        changeInitBtnState(false);
        UTMISSManager.getInstance().setUTMISSFlightDataUpdatedUploadStatusCallback(status -> mTvStatus.setText(String.format("current status is %s", status.toString())));
    }

    private void changeInitBtnState(boolean enable) {
        mTvInfo.setVisibility(enable ? View.GONE : View.VISIBLE);
        mBtnInit.setEnabled(enable);
        mEdtTokenKey.setEnabled(enable);
        mEdtManufactureId.setEnabled(enable);
        mEdtUasId.setEnabled(enable);
    }




}