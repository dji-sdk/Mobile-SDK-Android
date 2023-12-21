package com.dji.sdk.sample.demo.utmiss;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.dji.sdk.sample.databinding.ActivityUtmissBinding;

import java.io.File;

import dji.common.error.DJIError;
import dji.sdk.utmiss.UTMISSFlightDataUploadStatus;
import dji.sdk.utmiss.UTMISSManager;
import dji.sdk.utmiss.UTMISSParam;

import static com.dji.sdk.sample.internal.utils.ToastUtils.showToast;

public class UTMISSActivity extends AppCompatActivity {

    String dbPath;

    private ActivityUtmissBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUtmissBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

        binding.btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stop();
            }
        });
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
        binding.txtDbPath.setText(String.format("db path->%s\nlog path->%s", dbPath, UTMISSManager.getInstance().getUtmissLogPath()));
        binding.edtManufactureId.setText("test");
        binding.edtUasId.setText("UAS-DEFAULT");
        UTMISSFlightDataUploadStatus uploadStatus = UTMISSManager.getInstance().getUploadStatus();
        binding.txtStatus.setText(String.format("current status is %s", uploadStatus.toString()));
        if (uploadStatus != UTMISSFlightDataUploadStatus.UNKNOWN) {
            changeUI();
        }
    }

    private void stop() {
        UTMISSManager.getInstance().stopToUpload();
        changeInitBtnState(true);
    }

    private void start() {
        String tokenKey = binding.edtTokenKey.getText().toString().trim();
        if (TextUtils.isEmpty(tokenKey)) {
            showToast("pls enter token key first");
            return;
        }

        String manufactureId = binding.edtManufactureId.getText().toString().trim();
        if (TextUtils.isEmpty(manufactureId)) {
            showToast("pls enter manufactureId first");
            return;
        }

        String uasId = binding.edtManufactureId.getText().toString().trim();
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
        UTMISSManager.getInstance().setUTMISSFlightDataUpdatedUploadStatusCallback(status -> binding.txtStatus.setText(String.format("current status is %s", status.toString())));
    }

    private void changeInitBtnState(boolean enable) {
        binding.txtInfo.setVisibility(enable ? View.GONE : View.VISIBLE);
        binding.btnStart.setEnabled(enable);
        binding.edtTokenKey.setEnabled(enable);
        binding.edtManufactureId.setEnabled(enable);
        binding.edtUasId.setEnabled(enable);
    }

}
