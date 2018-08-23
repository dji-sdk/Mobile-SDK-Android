package com.dji.sdk.sample.internal.utils;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import dji.midware.usb.P3.UsbAccessoryService;
import dji.sdk.camera.VideoFeeder;
import dji.sdk.codec.DJICodecManager;
import dji.thirdparty.rx.Observable;
import dji.thirdparty.rx.android.schedulers.AndroidSchedulers;
import dji.thirdparty.rx.functions.Action1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * VideoView will show the live video for the given video feed.
 */
public class VideoFeedView extends TextureView implements SurfaceTextureListener {
    //region Properties
    private final static String TAG = "DULFpvWidget";
    private DJICodecManager codecManager = null;
    private VideoFeeder.VideoDataCallback videoDataCallback = null;
    private int videoWidth;
    private int videoHeight;
    private boolean isPrimaryVideoFeed;
    private View coverView;
    private final long WAIT_TIME = 500; // Half of a second
    private AtomicLong lastReceivedFrameTime = new AtomicLong(0);
    private Observable timer =
        Observable.timer(100, TimeUnit.MICROSECONDS).observeOn(AndroidSchedulers.mainThread()).repeat();

    //endregion

    //region Life-Cycle
    public VideoFeedView(Context context) {
        this(context, null, 0);
    }

    public VideoFeedView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VideoFeedView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public void setCoverView(View view) {
        coverView = view;
    }

    private void init() {
        // Avoid the rending exception in the Android Studio Preview view.
        if (isInEditMode()) {
            return;
        }

        setSurfaceTextureListener(this);
        videoDataCallback = new VideoFeeder.VideoDataCallback() {

            @Override
            public void onReceive(byte[] videoBuffer, int size) {

                lastReceivedFrameTime.set(System.currentTimeMillis());

                if (codecManager != null) {
                    codecManager.sendDataToDecoder(videoBuffer,
                                                   size,
                                                   isPrimaryVideoFeed
                                                   ? UsbAccessoryService.VideoStreamSource.Camera.getIndex()
                                                   : UsbAccessoryService.VideoStreamSource.Fpv.getIndex());
                }
            }
        };

        timer.subscribe(new Action1() {
            @Override
            public void call(Object o) {
                final long now = System.currentTimeMillis();
                final long ellapsedTime = now - lastReceivedFrameTime.get();
                if (coverView != null) {
                    if (ellapsedTime > WAIT_TIME && !ModuleVerificationUtil.isMavic2Product()) {
                        if (coverView.getVisibility() == INVISIBLE) {
                            coverView.setVisibility(VISIBLE);
                        }
                    } else {
                        if (coverView.getVisibility() == VISIBLE) {
                            coverView.setVisibility(INVISIBLE);
                        }
                    }
                }
            }
        });
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        if (codecManager == null) {
            codecManager = new DJICodecManager(this.getContext(),
                                               surface,
                                               width,
                                               height,
                                               isPrimaryVideoFeed
                                               ? UsbAccessoryService.VideoStreamSource.Camera
                                               : UsbAccessoryService.VideoStreamSource.Fpv);
        }
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        //Ignore
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        if (codecManager != null) {
            codecManager.cleanSurface();
            codecManager.destroyCodec();
            codecManager = null;
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        if (videoHeight != codecManager.getVideoHeight() || videoWidth != codecManager.getVideoWidth()) {
            videoWidth = codecManager.getVideoWidth();
            videoHeight = codecManager.getVideoHeight();
            adjustAspectRatio(videoWidth, videoHeight);
        }
    }
    //endregion

    //region Logic
    public void registerLiveVideo(VideoFeeder.VideoFeed videoFeed, boolean isPrimary) {
        isPrimaryVideoFeed = isPrimary;

        if (videoDataCallback != null && videoFeed != null) {
            videoFeed.setCallback(videoDataCallback);
        }
    }

    public void changeSourceResetKeyFrame() {
        if (codecManager != null) {
            codecManager.resetKeyFrame();
        }
    }
    //endregion

    //region Helper method

    /**
     * This method should not to be called until the size of `TextureView` is fixed.
     */
    private void adjustAspectRatio(int videoWidth, int videoHeight) {

        int viewWidth = this.getWidth();
        int viewHeight = this.getHeight();
        double aspectRatio = (double) videoHeight / videoWidth;

        int newWidth, newHeight;
        if (viewHeight > (int) (viewWidth * aspectRatio)) {
            // limited by narrow width; restrict height
            newWidth = viewWidth;
            newHeight = (int) (viewWidth * aspectRatio);
        } else {
            // limited by short height; restrict width
            newWidth = (int) (viewHeight / aspectRatio);
            newHeight = viewHeight;
        }
        int xoff = (viewWidth - newWidth) / 2;
        int yoff = (viewHeight - newHeight) / 2;

        Matrix txform = new Matrix();
        this.getTransform(txform);
        txform.setScale((float) newWidth / viewWidth, (float) newHeight / viewHeight);
        txform.postTranslate(xoff, yoff);
        this.setTransform(txform);
    }
    //endregion
}
