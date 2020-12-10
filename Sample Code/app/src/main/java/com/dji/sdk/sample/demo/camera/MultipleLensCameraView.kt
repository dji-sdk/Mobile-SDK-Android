package com.dji.sdk.sample.demo.camera

import android.app.Activity
import android.app.Service
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.dji.sdk.sample.R
import com.dji.sdk.sample.internal.controller.DJISampleApplication
import com.dji.sdk.sample.internal.controller.MainActivity.RequestEndFullScreenEvent
import com.dji.sdk.sample.internal.controller.MainActivity.RequestStartFullScreenEvent
import com.dji.sdk.sample.internal.utils.Helper
import com.dji.sdk.sample.internal.utils.PopupUtils
import com.dji.sdk.sample.internal.utils.ToastUtils
import com.dji.sdk.sample.internal.utils.VideoFeedView
import com.dji.sdk.sample.internal.view.PresentableView
import dji.common.airlink.PhysicalSource
import dji.common.camera.CameraVideoStreamSource
import dji.common.camera.LaserMeasureInformation
import dji.common.camera.SettingsDefinitions
import dji.common.error.DJIError
import dji.internal.logics.CommonUtil
import dji.keysdk.CameraKey
import dji.keysdk.DJIKey
import dji.keysdk.KeyManager
import dji.keysdk.callback.ActionCallback
import dji.keysdk.callback.GetCallback
import dji.keysdk.callback.SetCallback
import dji.sdk.camera.VideoFeeder
import dji.sdk.camera.VideoFeeder.PhysicalSourceListener
import dji.sdk.sdkmanager.DJISDKManager

class MultipleLensCameraView(context: Context) : LinearLayout(context), View.OnClickListener, PresentableView {

    private lateinit var primaryVideoFeedTitle: TextView
    private lateinit var primaryVideoFeed: VideoFeedView
    private lateinit var sourceListener: PhysicalSourceListener
    private lateinit var videoStreamSourceTitle: TextView
    private lateinit var videoStreamSourceCallback: CameraVideoStreamSource.Callback
    private lateinit var laserMeasureInformationTitle: TextView
    private lateinit var laserMeasureInformationCallback: LaserMeasureInformation.Callback

    init {
        orientation = HORIZONTAL
        isClickable = true
        val layoutInflater = context.getSystemService(Service.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        layoutInflater.inflate(R.layout.multiple_lens_camera_view, this, true)
        initUI()
        setUpListeners()
    }

    private fun initUI() {
        findViewById<View>(R.id.btn_video_stream_source).setOnClickListener(this)
        findViewById<View>(R.id.btn_laser_enabled).setOnClickListener(this)
        findViewById<View>(R.id.btn_flat_camera_mode).setOnClickListener(this)
        findViewById<View>(R.id.btn_hybrid_zoom_spec).setOnClickListener(this)
        findViewById<View>(R.id.btn_infrared_thermal_camera_shutter_enabled).setOnClickListener(this)
        primaryVideoFeedTitle = findViewById<View>(R.id.video_feed_title) as TextView
        primaryVideoFeed = findViewById<View>(R.id.primary_video_feed) as VideoFeedView
        videoStreamSourceTitle = findViewById<View>(R.id.video_stream_source_title) as TextView
        laserMeasureInformationTitle = findViewById<View>(R.id.laser_information_title) as TextView
    }

    private fun setUpListeners() {
        if (Helper.isM300Product()) {
            val product = DJISDKManager.getInstance().product
            // If your MutltipleLensCamera is set at right or top, you need to change the PhysicalSource to RIGHT_CAM or TOP_CAM.
            product.airLink.ocuSyncLink.assignSourceToPrimaryChannel(PhysicalSource.LEFT_CAM, PhysicalSource.FPV_CAM) { error ->
                val assignResult = error?.let {
                    "assignSourceToPrimaryChannel fail, reason: ${error.description}."
                } ?: "assignSourceToPrimaryChannel success."
                Helper.showToast(context as Activity?, assignResult)
            }
        }

        sourceListener = PhysicalSourceListener { videoFeed, newPhysicalSource ->
            if (videoFeed === VideoFeeder.getInstance().primaryVideoFeed) {
                val newText = "Primary Source: $newPhysicalSource"
                ToastUtils.setResultToText(primaryVideoFeedTitle, newText)
            }
        }

        primaryVideoFeed.registerLiveVideo(VideoFeeder.getInstance().primaryVideoFeed, true)
        val newText = "Primary Source: ${VideoFeeder.getInstance().primaryVideoFeed.videoSource.name}"
        ToastUtils.setResultToText(primaryVideoFeedTitle, newText)
        VideoFeeder.getInstance().addPhysicalSourceListener(sourceListener)

        videoStreamSourceCallback = CameraVideoStreamSource.Callback {
            val videoStreamsSourceText = "Video Stream Source: $it"
            ToastUtils.setResultToText(videoStreamSourceTitle, videoStreamsSourceText)
        }
        ToastUtils.setResultToText(primaryVideoFeedTitle, newText)
        DJISampleApplication.getProductInstance()
                .cameras?.get(0)?.setCameraVideoStreamSourceCallback(videoStreamSourceCallback)

        laserMeasureInformationCallback = LaserMeasureInformation.Callback {
            val laserMeasureInformationText = "Laser Information:\n $it"
            ToastUtils.setResultToText(laserMeasureInformationTitle, laserMeasureInformationText)
        }
        //Laser Measure Information for each lens is different.
        //We only set the listener for the lens at index 0.
        DJISampleApplication.getProductInstance()
                .cameras?.get(0)?.getLens(0)?.setLaserMeasureInformationCallback(laserMeasureInformationCallback)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_video_stream_source -> {
                val tempStreamSources: Array<CameraVideoStreamSource?>? = updateCameraVideoStreamSourceRange()
                val streamSources: Array<CameraVideoStreamSource?>?
                streamSources = tempStreamSources ?: arrayOfNulls(0)
                val runSetCameraStreamSource = Runnable {
                    if (PopupUtils.index[0] != -1) {
                        streamSources[PopupUtils.index[0]]?.let { setVideoStreamSource(it) }
                        PopupUtils.resetIndex()
                    }
                }
                if (streamSources.isNotEmpty()) {
                    PopupUtils.initPopupNumberPicker(Helper.makeList(streamSources), runSetCameraStreamSource, this)
                } else {
                    Helper.showToast(context as Activity?, "Cannot load camera video stream source range.")
                }
            }
            R.id.btn_laser_enabled -> {
                val laserEnabledArray = arrayOf(true, false)
                val runSetLaserEnabled = Runnable {
                    if (PopupUtils.index[0] != -1) {
                        setLaserEnabled(laserEnabledArray[PopupUtils.index[0]])
                        PopupUtils.resetIndex()
                    }
                }
                if (laserEnabledArray.isNotEmpty()) {
                    PopupUtils.initPopupNumberPicker(Helper.makeList(laserEnabledArray), runSetLaserEnabled, this)
                }
            }
            R.id.btn_flat_camera_mode -> {
                val tempFlatCameraModes: Array<SettingsDefinitions.FlatCameraMode?>? = updateFlatCameraModeRange()
                val flatCameraModes: Array<SettingsDefinitions.FlatCameraMode?>?
                flatCameraModes = tempFlatCameraModes ?: arrayOfNulls(0)
                val runSetFlatCameraMode = Runnable {
                    if (PopupUtils.index[0] != -1) {
                        flatCameraModes[PopupUtils.index[0]]?.let { setFlatCameraMode(it) }
                        PopupUtils.resetIndex()
                    }
                }
                if (flatCameraModes.isNotEmpty()) {
                    PopupUtils.initPopupNumberPicker(Helper.makeList(flatCameraModes), runSetFlatCameraMode, this)
                } else {
                    Helper.showToast(context as Activity?, "Cannot load flat camera mode.")
                }
            }
            R.id.btn_hybrid_zoom_spec -> {
                // For the method of 'createLensKey', first parameter is keyString,
                // secondary parameter is camera Index, third parameter is lens index.
                // The camera index is 0 in here. The lens index could get the value by the method of 'getLensIndex'
                val lensIndex: Int = CommonUtil.getLensIndex(0, SettingsDefinitions.LensType.ZOOM)
                KeyManager.getInstance().getValue(CameraKey.createLensKey(CameraKey.HYBRID_ZOOM_SPEC, 0, lensIndex), object : GetCallback {
                    override fun onSuccess(any: Any) {
                        val hybridZoomSpec = any as SettingsDefinitions.HybridZoomSpec
                        Helper.showToast(context as Activity?, "Get Hybrid Zoom Spec: $hybridZoomSpec")
                    }

                    override fun onFailure(error: DJIError) {
                        Helper.showToast(context as Activity?, "Get Hybrid Zoom Spec failed: ${error?.description}")
                    }
                })
            }
            R.id.btn_infrared_thermal_camera_shutter_enabled -> {
                // For the method of 'createLensKey', first parameter is keyString,
                // secondary parameter is camera Index, third parameter is lens index.
                // The camera index is 0 in here. The lens index could get the value by the method of 'getLensIndex'
                val lensIndex: Int = CommonUtil.getLensIndex(0, SettingsDefinitions.LensType.INFRARED_THERMAL)
                KeyManager.getInstance().performAction(CameraKey.createLensKey(CameraKey.INFRARED_THERMAL_CAMERA_SHUTTER_ENABLED, 0, lensIndex), object : ActionCallback {
                    override fun onSuccess() {
                        Helper.showToast(context as Activity?, "Set Infrared Thermal Camera Shutter Enabled Success!")
                    }

                    override fun onFailure(error: DJIError) {
                        Helper.showToast(context as Activity?, "Set Infrared Thermal Camera Shutter Enabled failed: ${error.description}")
                    }
                })
            }
        }
    }

    private fun updateCameraVideoStreamSourceRange(): Array<CameraVideoStreamSource?>? {
        val key: DJIKey = CameraKey.create(CameraKey.CAMERA_VIDEO_STREAM_SOURCE_RANGE, 0)
        return if (KeyManager.getInstance().getValue(key) == null) {
            null
        } else (KeyManager.getInstance().getValue(key) as Array<CameraVideoStreamSource?>?)
    }

    private fun setVideoStreamSource(videoStreamSource: CameraVideoStreamSource) {
        KeyManager.getInstance().setValue(CameraKey.create(CameraKey.CAMERA_VIDEO_STREAM_SOURCE, 0), videoStreamSource, object : SetCallback {
            override fun onSuccess() {
                Helper.showToast(context as Activity?, "Set Video Stream Source: $videoStreamSource Success!")
            }

            override fun onFailure(error: DJIError) {
                Helper.showToast(context as Activity?, "Set Video Stream Source failed: ${error.description}")
            }
        })
    }

    private fun setLaserEnabled(enabled: Boolean) {
        KeyManager.getInstance().setValue(CameraKey.create(CameraKey.LASER_ENABLED, 0), enabled, object : SetCallback {
            override fun onSuccess() {
                Helper.showToast(context as Activity?, "Set Laser Enabled: $enabled Success!")
            }

            override fun onFailure(error: DJIError) {
                Helper.showToast(context as Activity?, "Set Laser Enabled failed: ${error.description}")
            }
        })
    }

    private fun updateFlatCameraModeRange(): Array<SettingsDefinitions.FlatCameraMode?>? {
        val key: DJIKey = CameraKey.create(CameraKey.FLAT_CAMERA_MODE_RANGE, 0)
        return if (KeyManager.getInstance().getValue(key) == null) {
            null
        } else (KeyManager.getInstance().getValue(key) as Array<SettingsDefinitions.FlatCameraMode?>?)
    }

    private fun setFlatCameraMode(flatCameraMode: SettingsDefinitions.FlatCameraMode) {
        KeyManager.getInstance().setValue(CameraKey.create(CameraKey.FLAT_CAMERA_MODE, 0), flatCameraMode, object : SetCallback {
            override fun onSuccess() {
                Helper.showToast(context as Activity?, "Set Flat Camera Mode: $flatCameraMode Success!")
            }

            override fun onFailure(error: DJIError) {
                Helper.showToast(context as Activity?, "Set Flat Camera Mode failed: ${error.description}")
            }
        })
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        DJISampleApplication.getEventBus().post(RequestStartFullScreenEvent())
    }

    override fun onDetachedFromWindow() {
        DJISampleApplication.getEventBus().post(RequestEndFullScreenEvent())
        tearDownListeners()
        super.onDetachedFromWindow()
    }

    private fun tearDownListeners() {
        VideoFeeder.getInstance().removePhysicalSourceListener(sourceListener)
        DJISampleApplication.getProductInstance()
                .cameras?.get(0)?.setCameraVideoStreamSourceCallback(null)
        DJISampleApplication.getProductInstance()
                .cameras?.get(0)?.getLens(0)?.setLaserMeasureInformationCallback(null)
    }

    override fun getDescription(): Int {
        return R.string.component_listview_multiple_lens_camera
    }

    override fun getHint(): String {
        return this@MultipleLensCameraView::class.simpleName + ".java"
    }
}
