package com.dji.sdk.sample.demo.flightcontroller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.error.DJIError;
import dji.common.error.DJIFlightHubError;
import dji.common.util.CommonCallbacks;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.flighthub.FlightHubManager;
import dji.sdk.flighthub.UploadState;
import dji.sdk.flighthub.model.OnlineDevice;
import dji.sdk.flighthub.model.FlightPathNode;
import dji.sdk.flighthub.model.HistoricalFlight;
import dji.sdk.flighthub.model.LiveStream;
import dji.sdk.flighthub.model.RealTimeFlightData;
import dji.sdk.flighthub.model.Team;
import dji.sdk.flighthub.model.UpStream;
import dji.sdk.products.Aircraft;
import dji.sdk.sdkmanager.DJISDKManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * View that shows how to use the FlightHub feature. In order to access the FlightHub features, the user must first
 * be logged in, then authorized to show they have a valid FlightHub license.
 *
 * See https://www.dji.com/flighthub for more details.
 */
public class FlightHubView extends LinearLayout implements PresentableView, View.OnClickListener {

    Button authService;
    Button bindAircraft;
    Button unbindAircraft;
    Button getTeamInfo;
    Button checkLiveStreamStability;
    Button getFlightStatistics;
    Button getStreamSources;
    Button getStreamDestination;
    Button getStreamingDevices;
    Button getOnlineDevices;
    Button getRealTimeData;
    Button getFlightPath;
    Button startUploadFlightData;
    Button stopUploadFlightData;
    Button setUploadInterval;
    Button getUploadInterval;
    EditText etxTeamId;
    EditText etxAccount;
    TextView tvFlighthubInfo;
    TextView tvUploadStatus;
    TextView tvAuthStatus;

    private FlightController flightController;
    private String serialNumber;
    private String cacheOrderId = "";

    public FlightHubView(Context context) {
        super(context);
        initUI();

        initFC();
        FlightHubManager flightHubManager = DJISDKManager.getInstance().getFlightHubManager();
        tvUploadStatus.setText(flightHubManager.getUploadState().toString());
        flightHubManager.addUpdatedUploadStateCallback(new FlightHubManager.UpdatedUploadStateCallback() {
            @Override
            public void onUpdate(@NonNull final UploadState uploadState, final DJIError error) {
                post(new Runnable() {
                    @Override
                    public void run() {
                        StringBuilder sb = new StringBuilder(uploadState.name());
                        if (error != null) {
                            sb.append("\n");
                            sb.append(error.getDescription());
                        }
                        sb.append("\n\n");
                        tvUploadStatus.setText(sb.toString());
                    }
                });
            }
        });
    }

    private void initFC() {
        if (DJISampleApplication.getProductInstance() == null) {
            flightController = null;
            ToastUtils.setResultToToast(getResources().getString(R.string.playback_disconnected));
        } else {
            Aircraft aircraft = (Aircraft) DJISampleApplication.getProductInstance();
            if (null != aircraft.getFlightController()) {
                flightController = aircraft.getFlightController();
                flightController.getSerialNumber(new CommonCallbacks.CompletionCallbackWith<String>() {
                    @Override
                    public void onSuccess(String s) {
                        serialNumber = s;
                    }
                    @Override
                    public void onFailure(DJIError djiError) {
                        ToastUtils.setResultToToast("getSerialNumber failed: " + djiError.getDescription());
                    }
                });
            }
        }

    }

    private void initUI() {
        setOrientation(VERTICAL);
        inflate(getContext(), R.layout.view_flight_hub, this);

        authService = (Button) findViewById(R.id.fh_auth);
        bindAircraft = (Button) findViewById(R.id.fh_bind_aircraft);
        unbindAircraft = (Button) findViewById(R.id.fh_unbind_aircraft);
        getTeamInfo = (Button) findViewById(R.id.fh_get_team_info);
        checkLiveStreamStability = (Button) findViewById(R.id.fh_check_live_stream_stability);
        getFlightStatistics = (Button) findViewById(R.id.fh_get_flight_statistics);
        getStreamSources = (Button) findViewById(R.id.fh_get_stream_source);
        getStreamDestination = (Button) findViewById(R.id.fh_get_stream_destination);
        getStreamingDevices = (Button) findViewById(R.id.fh_get_streaming_devices);
        getOnlineDevices = (Button) findViewById(R.id.fh_get_online_devices);
        getRealTimeData = (Button) findViewById(R.id.fh_get_real_time_data);
        getFlightPath = (Button) findViewById(R.id.fh_get_flight_path);
        startUploadFlightData = (Button) findViewById(R.id.fh_start_upload_flight_data);
        stopUploadFlightData = (Button) findViewById(R.id.fh_stop_upload_flight_data);
        getUploadInterval = (Button) findViewById(R.id.fh_get_upload_interval);
        setUploadInterval = (Button) findViewById(R.id.fh_set_upload_interval);
        etxTeamId = (EditText) findViewById(R.id.fh_team_id);
        etxAccount = (EditText) findViewById(R.id.fh_account);
        tvFlighthubInfo = (TextView) findViewById(R.id.flight_hub_info_tv);
        tvUploadStatus = (TextView) findViewById(R.id.tv_upload_status);
        tvAuthStatus = (TextView) findViewById(R.id.tv_auth_status);

        authService.setOnClickListener(this);
        bindAircraft.setOnClickListener(this);
        unbindAircraft.setOnClickListener(this);
        getTeamInfo.setOnClickListener(this);
        checkLiveStreamStability.setOnClickListener(this);
        getFlightStatistics.setOnClickListener(this);
        getStreamSources.setOnClickListener(this);
        getStreamDestination.setOnClickListener(this);
        getStreamingDevices.setOnClickListener(this);
        getOnlineDevices.setOnClickListener(this);
        getRealTimeData.setOnClickListener(this);
        getFlightPath.setOnClickListener(this);
        startUploadFlightData.setOnClickListener(this);
        stopUploadFlightData.setOnClickListener(this);
        getUploadInterval.setOnClickListener(this);
        setUploadInterval.setOnClickListener(this);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        //initialize the authorization status TextView
        tvAuthStatus.setText("Authorized: " + DJISDKManager.getInstance().getFlightHubManager().isUserActivated());
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.fh_auth:
                startAuthorizeService();
                break;
            case R.id.fh_bind_aircraft:
                bindAircraft();
                break;
            case R.id.fh_unbind_aircraft:
                unbindAircraft();
                break;
            case R.id.fh_get_team_info:
                getTeamInfo();
                break;
            case R.id.fh_check_live_stream_stability:
                checkLiveStreamStability();
                break;
            case R.id.fh_get_flight_statistics:
                getFlightStatistics();
                break;
            case R.id.fh_get_stream_source:
                getStreamSource();
                break;
            case R.id.fh_get_stream_destination:
                getStreamDestination();
                break;
            case R.id.fh_get_streaming_devices:
                getStreamingDevices();
                break;
            case R.id.fh_get_online_devices:
                getOnlineDevices();
                break;
            case R.id.fh_get_real_time_data:
                getRealTimeData();
                break;
            case R.id.fh_get_flight_path:
                getFlightPath();
                break;
            case R.id.fh_start_upload_flight_data:
                startUploadFlightData();
                break;
            case R.id.fh_stop_upload_flight_data:
                stopUploadFlightData();
                break;
            case R.id.fh_set_upload_interval:
                setUploadInterval();
                break;
            case R.id.fh_get_upload_interval:
                getUploadInterval();
                break;
        }
    }

    // Authorizes the current user to show they have a valid FlightHub license.
    private void startAuthorizeService() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().updateActivationState(new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError error) {
                    if (error == null) {
                        ToastUtils.setResultToToast("authorized successfully");
                        ToastUtils.setResultToText(tvAuthStatus, "Authorized: true");
                    } else {
                        ToastUtils.setResultToToast("authorized failed ：" + error.getDescription());
                        ToastUtils.setResultToText(tvAuthStatus, "Authorized: false");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Bind the connected aircraft to the given team
    private void bindAircraft() {
        try {
            if (TextUtils.isEmpty(etxTeamId.getText())) {
                ToastUtils.setResultToToast("Please enter team ID");
                return;
            }
            DJISDKManager.getInstance().getFlightHubManager().bindAircraft(etxTeamId.getText().toString(), new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError error) {
                    if (error == null) {
                        ToastUtils.setResultToToast("bindAircraft successfully");
                    } else {
                        ToastUtils.setResultToToast("bindAircraft failed : " + error.getDescription());
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Unbind the connected aircraft from its team
    private void unbindAircraft() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().unbindAircraft(new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError error) {
                    if (error == null) {
                        ToastUtils.setResultToToast("unbindAircraft successfully");
                    } else {
                        ToastUtils.setResultToToast("unbindAircraft failed: " + error.getDescription());
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Gets the information for all teams in a json format and displays it in the tvFlighthubInfo TextView
    private void getTeamInfo() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().getTeamsInformation(new CommonCallbacks.CompletionCallbackWith<List<Team>>() {
                @Override
                public void onSuccess(List<Team> teams) {
                    StringBuilder sb = new StringBuilder();
                    for (Team team : teams) {
                        sb.append(team.toString());
                        sb.append("\n");
                    }
                    final String str = sb.toString();
                    post(new Runnable() {
                        @Override
                        public void run() {
                            tvFlighthubInfo.setText(str);
                        }
                    });
                }
                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("getTeamsInformation failed: " + error.getDescription());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkLiveStreamStability() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().isLiveStreamStable(new CommonCallbacks.CompletionCallbackWith<Boolean>() {
                @Override
                public void onSuccess(Boolean aBoolean) {
                    ToastUtils.setResultToToast("isLiveStreamStable: " + aBoolean);
                }
                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("isLiveStreamStable failed: " + error.getDescription());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getFlightStatistics() {
        try {
            if (TextUtils.isEmpty(etxAccount.getText())) {
                ToastUtils.setResultToToast("Please enter account");
                return;
            }
            if (TextUtils.isEmpty(etxTeamId.getText())) {
                ToastUtils.setResultToToast("Please enter team ID");
                return;
            }

            //find records from 01/01/2017
            String dateStr = "01/01/2017";
            Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateStr);
            long startTime = date.getTime();
            final long endTime = System.currentTimeMillis();

            String account = etxAccount.getText().toString();
            String teamId = etxTeamId.getText().toString();

            DJISDKManager.getInstance().getFlightHubManager().getFlightStatistics(startTime, endTime, account, teamId, new CommonCallbacks.CompletionCallbackWith<HistoricalFlight>() {
                @Override
                public void onSuccess(final HistoricalFlight historicalFlight) {
                    post(new Runnable() {
                        @Override
                        public void run() {

                            tvFlighthubInfo.setText(historicalFlight.toString());
                            if (historicalFlight.getHistory().size() > 0) {
                                cacheOrderId = historicalFlight.getHistory().get(0).getOrderId();
                            }
                        }
                    });
                }
                @Override
                public void onFailure(DJIError error) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // gets an encoded stream sourced from other aircrafts in FlightHub
    private void getStreamSource() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().getLiveViewStreamSource(serialNumber, new CommonCallbacks.CompletionCallbackWith<LiveStream>() {
                @Override
                public void onSuccess(final LiveStream liveStream) {
                    post(new Runnable() {
                        @Override
                        public void run() {
                            tvFlighthubInfo.setText(liveStream.toString());
                        }
                    });
                }
                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("getLiveViewStreamSource failed: " + error.getDescription());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // gets the stream destination for this aircraft's stream
    private void getStreamDestination() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().getLiveViewStreamDestination(new CommonCallbacks.CompletionCallbackWith<UpStream>() {
                @Override
                public void onSuccess(final UpStream upStream) {
                    post(new Runnable() {
                        @Override
                        public void run() {
                            tvFlighthubInfo.setText(upStream.toString());
                        }
                    });
                }
                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("getLiveViewStreamDestination failed: " + error.getDescription());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // gets the list of devices that are uploading their streams to FlightHub
    private void getStreamingDevices() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().getStreamingDevices(new CommonCallbacks.CompletionCallbackWith<List<OnlineDevice>>() {
                @Override
                public void onSuccess(List<OnlineDevice> onlineDevices) {
                    StringBuilder sb = new StringBuilder();
                    for (OnlineDevice s : onlineDevices) {
                        sb.append(s.toString());
                        sb.append("\n");
                    }
                    final String str = sb.toString();
                    post(new Runnable() {
                        @Override
                        public void run() {
                            tvFlighthubInfo.setText(str);
                        }
                    });
                }
                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("getStreamingDevices failed: " + error.getDescription());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getOnlineDevices() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().getOnlineDevices(new CommonCallbacks.CompletionCallbackWith<List<OnlineDevice>>() {
                @Override
                public void onSuccess(List<OnlineDevice> onlineDevices) {
                    StringBuilder sb = new StringBuilder();
                    for (OnlineDevice s : onlineDevices) {
                        sb.append(s.toString());
                        sb.append("\n");
                    }
                    final String str = sb.toString();
                    post(new Runnable() {
                        @Override
                        public void run() {
                            tvFlighthubInfo.setText(str);
                        }
                    });
                }
                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("getOnlineDevices failed: " + error.getDescription());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // gets real time flight data of the aircraft with the given serial number
    private void getRealTimeData() {
        final ArrayList<String> serialNumbers = new ArrayList<>(1);
        serialNumbers.add(serialNumber);
        try {
            DJISDKManager.getInstance().getFlightHubManager().getAircraftRealTimeFlightData(serialNumbers, new CommonCallbacks.CompletionCallbackWith<List<RealTimeFlightData>>() {
                @Override
                public void onSuccess(List<RealTimeFlightData> realTimeFlightData) {
                    StringBuilder sb = new StringBuilder();
                    for (RealTimeFlightData s : realTimeFlightData) {
                        sb.append(s.toString());
                        sb.append("\n");
                    }
                    final String str = sb.toString();
                    post(new Runnable() {
                        @Override
                        public void run() {
                            tvFlighthubInfo.setText(str);
                        }
                    });
                }
                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("getAircraftRealTimeFlightData failed: " + error.getDescription());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getFlightPath() {
        if (TextUtils.isEmpty(cacheOrderId)) {
            ToastUtils.setResultToToast("The order ID should be obtained from the flight statistics first");
            return;
        }
        try {
            DJISDKManager.getInstance().getFlightHubManager().getHistoricalFlightPath(cacheOrderId, new CommonCallbacks.CompletionCallbackWith<List<FlightPathNode>>() {
                @Override
                public void onSuccess(List<FlightPathNode> flightPathNodes) {
                    StringBuilder sb = new StringBuilder();
                    for (FlightPathNode s : flightPathNodes) {
                        sb.append(s.toString());
                        sb.append("\n");
                    }
                    final String str = sb.toString();
                    post(new Runnable() {
                        @Override
                        public void run() {
                            tvFlighthubInfo.setText(str);
                        }
                    });
                }
                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("getHistoricalFlightPath failed: " + error.getDescription());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // starts uploading this aircraft's flight data to FlightHub
    private void startUploadFlightData() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().setUploadFlightDataEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // stops uploading this aircraft's flight data
    private void stopUploadFlightData() {
        try {
            DJISDKManager.getInstance().getFlightHubManager().setUploadFlightDataEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setUploadInterval() {
        if (TextUtils.isEmpty(etxTeamId.getText())) {
            ToastUtils.setResultToToast("Please enter team ID");
            return;
        }

        DJIFlightHubError error = DJISDKManager.getInstance().getFlightHubManager().setFlightDataUploadInterval(Integer.parseInt(etxTeamId.getText().toString()));

        if (error == null) {
            ToastUtils.setResultToToast("set interval successfully");
        } else {
            ToastUtils.setResultToToast("set interval failed: " + error.getDescription());
        }
    }

    private void getUploadInterval() {
        ToastUtils.setResultToToast("upload interval: " + DJISDKManager.getInstance().getFlightHubManager().getFlightDataUploadInterval());
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_flight_hub;
    }
}
