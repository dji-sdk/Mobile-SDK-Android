package com.dji.sdk.sample.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.Helper;

import java.util.ArrayList;
import java.util.List;

import dji.common.product.Model;
import dji.sdk.base.DJIDiagnostics;
import dji.sdk.sdkmanager.DJISDKManager;

public class HealthInformationView extends FrameLayout implements View.OnClickListener, PresentableView, DJIDiagnostics.DiagnosticsInformationCallback {
    private static final String TAG = HealthInformationView.class.getSimpleName();
    private TextView logTv;
    private TextView otherLogTv;
    private boolean isSupportHMS;

    public HealthInformationView(@NonNull Context context) {
        super(context);
        initView(context);
    }

    public HealthInformationView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public HealthInformationView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    public void initView(Context context) {
        if (DJISDKManager.getInstance().getProduct() != null) {
            isSupportHMS = DJISDKManager.getInstance().getProduct().getModel() == Model.MATRICE_300_RTK;
        } else {
            isSupportHMS = false;
        }
        View root = LayoutInflater.from(context).inflate(R.layout.view_health_information, this, true);
        logTv = root.findViewById(R.id.tv_log);
        otherLogTv = root.findViewById(R.id.tv_other_log);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public int getDescription() {
        return R.string.component_listview_health_information;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    @Override
    // the list contains all "type == DJIDiagnostics.DJIDiagnosticsType.DEVICE_HEALTH_INFORMATION" element at real time.
    public void onUpdate(List<DJIDiagnostics> list) {
        if (list == null || list.isEmpty()) {
            return;
        }

        List<HealthInfo> healthInfos = new ArrayList<>();
        for (DJIDiagnostics diagnostics : list) {
            if (diagnostics.getType() == DJIDiagnostics.DJIDiagnosticsType.DEVICE_HEALTH_INFORMATION) {
                handleHMS(diagnostics, healthInfos);
            } else {
                handleOther(diagnostics);
            }
        }
        updateLog(healthInfos, logTv);
    }

    private void handleOther(DJIDiagnostics diagnostics) {
        if (filter(diagnostics)) {
            return;
        }

        updateLog(diagnostics.getReason(), otherLogTv);
    }

    private boolean filter(DJIDiagnostics d) {
        if (!isSupportHMS) {
            return false;
        }
        List<HealthInfoMatchSDKError> errors = Helper.getHmsMatchSDKError(getContext());
        for (HealthInfoMatchSDKError e : errors) {
            if (e.getSdkErrorCode().equals(d.getCode())) {
                // this info will also be pushed by `type == DJIDiagnostics.DJIDiagnosticsType.DEVICE_HEALTH_INFORMATION`. so need filter.
                return true;
            }
        }
        return false;
    }

    private void handleHMS(DJIDiagnostics diagnostic, List<HealthInfo> cache) {
        // Get the tip from json
        List<HealthInfo> healthInfos = Helper.getHmsInfo(getContext());
        int index = healthInfos.indexOf(new HealthInfo("0x" + Long.toHexString(diagnostic.getHealthInformation().informationId()).toUpperCase() + ""));
        if (index >= 0) {
            HealthInfo info = healthInfos.get(index);
            if (!cache.contains(info)) {
                cache.add(info);
            }
        }
    }

    private void updateLog(String append, TextView tv) {
        StringBuffer sb = new StringBuffer(tv.getText() + "\n");
        sb.append(append).append("\n");
        tv.post(() -> tv.setText(sb.toString()));
    }

    private void updateLog(List<HealthInfo> list, TextView tv) {
        StringBuffer sb = new StringBuffer("HMS info:\n");

        for (HealthInfo info : list) {
            sb.append(info.toString()).append("\n");
        }
        tv.post(() -> tv.setText(sb.toString()));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (DJISDKManager.getInstance().getProduct() != null) {
            DJISDKManager.getInstance().getProduct().setDiagnosticsInformationCallback(this);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (DJISDKManager.getInstance().getProduct() != null) {
            DJISDKManager.getInstance().getProduct().setDiagnosticsInformationCallback(null);
        }
    }

    public static class HealthInfo {
        private String alarmId;
        private String tipEn;
        private String tipCn;

        public HealthInfo() {
        }

        public HealthInfo(String alarmId) {
            this.alarmId = alarmId;
        }

        public String getAlarmId() {
            return alarmId;
        }

        public void setAlarmId(String alarmId) {
            this.alarmId = alarmId;
        }

        public String getTipEn() {
            return tipEn;
        }

        public void setTipEn(String tipEn) {
            this.tipEn = tipEn;
        }

        public String getTipCn() {
            return tipCn;
        }

        public void setTipCn(String tipCn) {
            this.tipCn = tipCn;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof HealthInfo)) return false;

            HealthInfo that = (HealthInfo) o;

            return alarmId != null ? alarmId.equals(that.alarmId) : that.alarmId == null;
        }

        @Override
        public int hashCode() {
            return alarmId != null ? alarmId.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "HealthInfo{" +
                    "alarmId='" + alarmId + '\'' +
                    ", tipEn='" + tipEn + '\'' +
                    ", tipCn='" + tipCn + '\'' +
                    '}';
        }
    }

    public static class HealthInfoMatchSDKError {
        private String alarmId;
        private String sdkErrorCode;
        private String sdkErrorEnumName;

        public String getAlarmId() {
            return alarmId;
        }

        public void setAlarmId(String alarmId) {
            this.alarmId = alarmId;
        }

        public String getSdkErrorCode() {
            return sdkErrorCode;
        }

        public void setSdkErrorCode(String sdkErrorCode) {
            this.sdkErrorCode = sdkErrorCode;
        }

        public String getSdkErrorEnumName() {
            return sdkErrorEnumName;
        }

        public void setSdkErrorEnumName(String sdkErrorEnumName) {
            this.sdkErrorEnumName = sdkErrorEnumName;
        }
    }
}
