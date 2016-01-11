package com.dji.sdk.sample.missionmanager;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.Utils;
import com.dji.sdk.sample.missionmanager.FollowmeMissionView.UpdateFollowmeSimLocationThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import dji.sdk.Camera.DJIMedia;
import dji.sdk.FlightController.DJIFlightController;
import dji.sdk.FlightController.DJIFlightControllerDataType;
import dji.sdk.FlightController.DJIFlightControllerDataType.DJIFlightControllerFlightMode;
import dji.sdk.FlightController.DJIFlightControllerDelegate;
import dji.sdk.MissionManager.DJIFollowMeMission;
import dji.sdk.MissionManager.DJIHotPointMission;
import dji.sdk.MissionManager.DJIMission;
import dji.sdk.MissionManager.DJIMissionManager;
import dji.sdk.MissionManager.DJIPanoramaMission;
import dji.sdk.MissionManager.DJIWaypointMission;
import dji.sdk.Products.DJIAircraft;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIBaseComponent.DJICompletionCallback;
import dji.sdk.base.DJIBaseProduct;
import dji.sdk.base.DJIError;

/**
 * Class for basic manager view in mission manager
 */
public abstract class MissionManagerBaseView extends LinearLayout implements View.OnClickListener, DJIMissionManager.MissionProgressStatusCallback {

    protected DJIMission mDJIMission;
    private DJIMissionManager mMissionManager;
    private DJIFlightController mFlightController;

    protected Context mContext;
    protected Button mPrepareBtn;
    protected Button mStartBtn;
    protected Button mStopBtn;
    protected Button mPauseBtn;
    protected Button mResumeBtn;
    protected Button mDownloadBtn;

    protected TextView mMissionPushInfoTV;
    protected TextView mFCPushInfoTV;
    protected ProgressBar mPB;

    private Handler mUIHandler = new Handler(Looper.getMainLooper());

    protected double mHomeLatitude = 181;
    protected double mHomeLongitude = 181;
    private DJIFlightControllerFlightMode flightState = null;
    private UpdateFollowmeSimLocationThread mUpdateSimLocateThread = null;

    protected StringBuffer pushSB = null;
    private Animation mFadeoutAnimation;



    private void setProgressBar(final int progress) {
        mUIHandler.post(new Runnable() {
            @Override
            public void run() {
                if (progress >= 100) {
                    mPB.setVisibility(View.VISIBLE);
                    mPB.setProgress(100);
                    mFadeoutAnimation.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {
                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            mPB.setVisibility(View.INVISIBLE);
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {
                        }
                    });
                    mUIHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mPB.startAnimation(mFadeoutAnimation);
                        }
                    });

                } else if (progress < 0) {
                    mPB.setVisibility(View.INVISIBLE);
                    mPB.setProgress(0);
                } else {
                    mPB.setVisibility(View.VISIBLE);
                    mPB.setProgress(0);
                }
            }
        });
    }

    public MissionManagerBaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        initUI(context, attrs);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        DJIBaseProduct product = DJISampleApplication.getProductInstance();

        if (product == null || !product.isConnected()) {
            Utils.setResultToToast(mContext, "Disconnect");
            mMissionManager = null;
            mFlightController = null;
            return;
        } else {
            mMissionManager = product.getMissionManager();
            if(product instanceof DJIAircraft) {
                mFlightController = ((DJIAircraft)product).getFlightController();
            }

            if (mMissionManager != null) {
                //The callback method is implemented in the subclasses
                mMissionManager.setMissionProgressStatusCallback(this);
            }

            if (mFlightController != null) {

                mFlightController.setUpdateSystemStateCallback(new DJIFlightControllerDelegate.FlightControllerUpdateSystemStateCallback() {

                    @Override
                    public void onResult(DJIFlightControllerDataType.DJIFlightControllerCurrentState state) {

                        mHomeLatitude = state.getHomeLocation().getLatitude();
                        mHomeLongitude = state.getHomeLocation().getLongitude();
                        flightState = state.getFlightMode();

                        Utils.setResultToText(mContext, mFCPushInfoTV, "home point latitude: " + mHomeLatitude +
                                "\nhome point longitude: " + mHomeLongitude +
                                "\nFlight state: " + flightState.name());

                    }
                });
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void initUI(Context context, AttributeSet attrs) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        View content = layoutInflater.inflate(R.layout.view_mission, null, false);
        addView(content, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        mFadeoutAnimation = AnimationUtils.loadAnimation(mContext, R.anim.fade_out);

        mMissionPushInfoTV = (TextView)findViewById(R.id.tv_mission_info);
        mFCPushInfoTV = (TextView)findViewById(R.id.tv_fc_info);
        mPrepareBtn = (Button)findViewById(R.id.btn_prepare);
        mStartBtn = (Button)findViewById(R.id.btn_start);
        mStopBtn = (Button)findViewById(R.id.btn_stop);
        mPauseBtn = (Button)findViewById(R.id.btn_pause);
        mResumeBtn = (Button)findViewById(R.id.btn_resume);
        mDownloadBtn = (Button)findViewById(R.id.btn_download);
        mPB = (ProgressBar)findViewById(R.id.pb_mission);

        mPrepareBtn.setOnClickListener(this);
        mStartBtn.setOnClickListener(this);
        mStopBtn.setOnClickListener(this);
        mPauseBtn.setOnClickListener(this);
        mResumeBtn.setOnClickListener(this);
        mDownloadBtn.setOnClickListener(this);
    }

    protected abstract DJIMission initMission();

    @Override
    public void onClick(View v) {
        mMissionManager = DJIMissionManager.getInstance();

        if (
                DJISampleApplication.getProductInstance() instanceof DJIAircraft &&
                !Utils.checkGpsCoordinate(mHomeLatitude, mHomeLongitude) &&
                        mFlightController != null
                ) {
            final CountDownLatch cdl = new CountDownLatch(1);
            mFlightController.getHomeLocation(new DJIBaseComponent.DJICompletionCallbackWith<DJIFlightControllerDataType.DJILocationCoordinate2D>() {

                @Override
                public void onSuccess(DJIFlightControllerDataType.DJILocationCoordinate2D t) {
                    mHomeLatitude = t.getLatitude();
                    mHomeLongitude = t.getLongitude();
                    Utils.setResultToText(mContext, mFCPushInfoTV, "home point latitude: " + mHomeLatitude +
                            "\nhome point longitude: " + mHomeLongitude +
                            "\nFlight state: " + (flightState == null ? "" : flightState.name()));
                }

                @Override
                public void onFailure(DJIError error) {
                    cdl.countDown();
                }
            });
            try {
                cdl.await(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!Utils.checkGpsCoordinate(mHomeLatitude, mHomeLongitude)) {
                Utils.setResultToToast(mContext, "Home coordinates not yet set...");
                return;
            }
        }
        switch (v.getId()) {
            case R.id.btn_prepare:
                mDJIMission = initMission();
                if (mDJIMission == null) {
                    Utils.setResultToToast(mContext, "Please choose a mission type...");
                }
                mMissionManager.prepareMission(mDJIMission, new DJIMission.DJIMissionProgressHandler() {

                    @Override
                    public void onProgress(DJIMission.DJIProgressType type, float progress) {
                        setProgressBar((int)(progress * 100f));
                    }

                }, new DJICompletionCallback() {


                    @Override
                    public void onResult(DJIError error) {
                        if (error == null) {
                            Utils.setResultToToast(mContext, "Success!");
                        } else {
                            Utils.setResultToToast(mContext, "Prepare: " + error.getDescription());
                        }
                    }
                });
            break;
            case R.id.btn_start:
                if (mDJIMission != null) {
                    mMissionManager.setMissionExecutionFinishedCallback(new DJICompletionCallback() {

                        @Override
                        public void onResult(DJIError error) {
                            Utils.setResultToToast(mContext, "Mission executing result: " + (error == null ? "Success" : error.getDescription()));
                            if (mDJIMission instanceof DJIPanoramaMission) {
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                ((DJIPanoramaMission) mDJIMission).getPanoramaMediaFile(new DJIBaseComponent.DJICompletionCallbackWith<DJIMedia>() {
                                    @Override
                                    public void onSuccess(DJIMedia djiMedia) {
                                        Utils.setResultToToast(mContext, "Index: " + djiMedia.getId());
                                    }

                                    @Override
                                    public void onFailure(DJIError djiError) {
                                        Utils.setResultToToast(mContext, "Get panorama media file failed!");
                                    }
                                });
                            }
                        }
                    });
                }
                //For the panorama mission, there will be no callback in some cases, we will fix it in next version.
                mMissionManager.startMissionExecution(new DJICompletionCallback() {

                    @Override
                    public void onResult(DJIError mError) {

                        if (mError == null) {
                            if (mDJIMission instanceof DJIFollowMeMission && mUpdateSimLocateThread == null) {
                                mUpdateSimLocateThread = new UpdateFollowmeSimLocationThread(mDJIMission, mHomeLatitude, mHomeLongitude);
                                mUpdateSimLocateThread.start();
                            }
                        } else {
                            Utils.setResultToToast(mContext, "Start: " + mError.getDescription());
                        }
                    }
                });
            break;
            case R.id.btn_stop:
                mMissionManager.stopMissionExecution(new DJICompletionCallback() {

                    @Override
                    public void onResult(DJIError mError) {
                        if (mError == null) {
                            Utils.setResultToToast(mContext, "Success!");
                            if (mUpdateSimLocateThread != null) {
                                mUpdateSimLocateThread.stopRunning();
                                mUpdateSimLocateThread = null;
                            }
                        } else {
                            Utils.setResultToToast(mContext, "Stop: " + mError.getDescription());
                        }


                    }
                });
            break;
            case R.id.btn_pause:
                mMissionManager.pauseMissionExecution(new DJICompletionCallback() {

                    @Override
                    public void onResult(DJIError mError) {
                        if (mError == null) {
                            Utils.setResultToToast(mContext, "Success!");
                            if (mUpdateSimLocateThread != null) {
                                mUpdateSimLocateThread.setIsPause(true);
                            }
                        } else {
                            Utils.setResultToToast(mContext, "Pause: " + mError.getDescription());
                        }
                    }
                });
            break;
            case R.id.btn_resume:
                mMissionManager.resumeMissionExecution(new DJICompletionCallback() {

                    @Override
                    public void onResult(DJIError mError) {
                        if (mError == null) {
                            Utils.setResultToToast(mContext, "Success!");
                            if (mUpdateSimLocateThread != null) {
                                mUpdateSimLocateThread.setIsPause(false);
                            }
                        } else {
                            Utils.setResultToToast(mContext, "Resume" + mError.getDescription());
                        }
                    }
                });
            break;
            case R.id.btn_download:
                //download action only downloads the currently executing missions' data
                mMissionManager.downloadMission(new DJIMission.DJIMissionProgressHandler() {

                    @Override
                    public void onProgress(DJIMission.DJIProgressType type, float progress) {
                        setProgressBar((int)(progress * 100f));
                    }
                }, new DJIBaseComponent.DJICompletionCallbackWith<DJIMission>() {

                    @Override
                    public void onSuccess(DJIMission mission) {
                        StringBuffer sb = new StringBuffer();
                        //we do this check to ensure the download data is only for the
                        //currently executing mission and is independent of the
                        //view the user is looking at
                        if (mission instanceof DJIWaypointMission) {
                            Utils.addLineToSB(sb, "Repeat num", ((DJIWaypointMission) mission).repeatNum);
                            Utils.addLineToSB(sb, "Heading mode", ((DJIWaypointMission) mission).headingMode);
                            Utils.addLineToSB(sb, "Finish action", ((DJIWaypointMission) mission).finishedAction);
                            Utils.addLineToSB(sb, "Flight path mode", ((DJIWaypointMission) mission).flightPathMode);
                            Utils.addLineToSB(sb, "Max flight speed", ((DJIWaypointMission) mission).maxFlightSpeed);
                            Utils.addLineToSB(sb, "Auto flight speed", ((DJIWaypointMission) mission).autoFlightSpeed);
                        } else if (mission instanceof DJIHotPointMission) {
                            Utils.addLineToSB(sb, "Latitude", ((DJIHotPointMission) mission).latitude);
                            Utils.addLineToSB(sb, "Longitude", ((DJIHotPointMission) mission).longitude);
                            Utils.addLineToSB(sb, "Altitude", ((DJIHotPointMission) mission).altitude);
                            Utils.addLineToSB(sb, "Surround radius", ((DJIHotPointMission) mission).radius);
                            Utils.addLineToSB(sb, "Angular velocity", ((DJIHotPointMission) mission).angularVelocity);
                            Utils.addLineToSB(sb, "Is clockwise", ((DJIHotPointMission) mission).isClockwise);
                            Utils.addLineToSB(sb, "Entry point", ((DJIHotPointMission) mission).startPoint);
                            Utils.addLineToSB(sb, "Heading mode", ((DJIHotPointMission) mission).heading);
                        } else if (mission instanceof DJIFollowMeMission) {
                            Utils.addLineToSB(sb, "Heading mode", ((DJIFollowMeMission) mission).heading);
                        } else {
                            sb.append("Unknown mission instance!");
                        }
                        Utils.setResultToToast(mContext, sb.toString());
                    }

                    public void onFailure(DJIError error) {
                        Utils.setResultToToast(mContext, "Download: " + error.getDescription());
                    }
                }
                );
                break;
            default:
                break;

        }
    }
}
