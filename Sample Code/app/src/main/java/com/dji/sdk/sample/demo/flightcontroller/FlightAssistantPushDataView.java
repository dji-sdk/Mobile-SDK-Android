package com.dji.sdk.sample.demo.flightcontroller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.view.BaseThreeBtnView;
import dji.common.flightcontroller.ObstacleDetectionSector;
import dji.common.flightcontroller.VisionDetectionState;
import dji.sdk.flightcontroller.FlightAssistant;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.products.Aircraft;

/**
 * Class that retrieves the push data for Intelligent Flight Assistant
 */
public class FlightAssistantPushDataView extends BaseThreeBtnView {

    public FlightAssistantPushDataView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (ModuleVerificationUtil.isFlightControllerAvailable()) {
            FlightController flightController =
                ((Aircraft) DJISampleApplication.getProductInstance()).getFlightController();

            FlightAssistant intelligentFlightAssistant = flightController.getFlightAssistant();

            if (intelligentFlightAssistant != null) {

                intelligentFlightAssistant.setVisionDetectionStateUpdatedCallback(new VisionDetectionState.Callback() {
                    @Override
                    public void onUpdate(@NonNull VisionDetectionState visionDetectionState) {
                        StringBuilder stringBuilder = new StringBuilder();

                        ObstacleDetectionSector[] visionDetectionSectorArray =
                            visionDetectionState.getDetectionSectors();

                        for (ObstacleDetectionSector visionDetectionSector : visionDetectionSectorArray) {

                            visionDetectionSector.getObstacleDistanceInMeters();
                            visionDetectionSector.getWarningLevel();

                            stringBuilder.append("Obstacle distance: ")
                                        .append(visionDetectionSector.getObstacleDistanceInMeters())
                                        .append("\n");
                            stringBuilder.append("Distance warning: ")
                                        .append(visionDetectionSector.getWarningLevel())
                                        .append("\n");
                        }

                        stringBuilder.append("WarningLevel: ")
                                    .append(visionDetectionState.getSystemWarning().name())
                                    .append("\n");
                        stringBuilder.append("Sensor state: ")
                                    .append(visionDetectionState.isSensorBeingUsed())
                                    .append("\n");

                        changeDescription(stringBuilder.toString());
                    }
                });
            }
        } else {
            Log.i(DJISampleApplication.TAG, "onAttachedToWindow FC NOT Available");
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (ModuleVerificationUtil.isFlightControllerAvailable()) {
            FlightAssistant intelligentFlightAssistant = ((Aircraft) DJISampleApplication.getProductInstance()).getFlightController().getFlightAssistant();
            if(intelligentFlightAssistant != null) {
                intelligentFlightAssistant.setVisionDetectionStateUpdatedCallback(null);
            }
        }
    }

    @Override
    protected int getDescriptionResourceId() {
        return R.string.intelligent_flight_assistant_description;
    }

    @Override
    protected void handleRightBtnClick() {

    }

    @Override
    protected void handleMiddleBtnClick() {

    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return DISABLE;
    }

    @Override
    protected int getRightBtnTextResourceId() {
        return DISABLE;
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return DISABLE;
    }

    @Override
    protected void handleLeftBtnClick() {
    }

    @Override
    public int getDescription() {
        return R.string.flight_controller_listview_intelligent_flight_assistant;
    }
}
