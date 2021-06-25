package com.dji.sdk.sample.demo.lidar

import android.app.Service
import android.content.Context
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.dji.sdk.sample.R
import com.dji.sdk.sample.internal.controller.DJISampleApplication
import com.dji.sdk.sample.internal.controller.MainActivity
import com.dji.sdk.sample.internal.utils.ToastUtils
import com.dji.sdk.sample.internal.utils.ViewHelper
import com.dji.sdk.sample.internal.view.PopupNumberPicker
import com.dji.sdk.sample.internal.view.PopupNumberPickerDouble
import com.dji.sdk.sample.internal.view.PresentableView
import dji.common.airlink.PhysicalSource
import dji.common.error.DJIError
import dji.common.perception.DJILidarPointCloudRecord
import dji.common.perception.DJILidarPointCloudVisibleLightPixelMode
import dji.common.perception.RecordingStatus
import dji.lidar_map.views.PointCloudColorMode
import dji.sdk.camera.VideoFeeder
import dji.sdk.lidar.Lidar
import dji.sdk.lidar.Lidar.DJIPointCloudLiveDataListener
import dji.sdk.lidar.Lidar.DJIPointCloudStatusListener
import dji.sdk.lidar.processor.DJILidarLiveViewDataProcessor
import dji.sdk.lidar.processor.PointCloudDisplayMode
import dji.sdk.lidar.reader.PointCloudLiveViewData
import dji.sdk.products.Aircraft
import dji.sdk.sdkmanager.DJISDKManager
import kotlinx.android.synthetic.main.view_lidar.view.*
import java.util.*

/**
 * Zenmuse L1 only works on left gimbal.
 */
class LidarView(context: Context) : LinearLayout(context), PresentableView, View.OnClickListener {

    private var currentLidar: Lidar? = null
    private var pointCloudStatusListener: DJIPointCloudStatusListener? = null

    private var mPopupNumberPicker: PopupNumberPicker? = null
    private var mPopupDoubleNumberPicker: PopupNumberPickerDouble? = null
    private val indexChosen = intArrayOf(-1, -1, -1)

    private var pointCloudColorMode: PointCloudColorMode? = null
    private var lidarPointCloudVisibleLightPixelMode: DJILidarPointCloudVisibleLightPixelMode? =
        null
    private var pointCloudDisplayMode: PointCloudDisplayMode? = null
    private var recordingStatus: RecordingStatus? = null
    private var recordingTime: Long = 0

    init {
        initUI(context)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        video_view_primary_video_feed.registerLiveVideo(
            VideoFeeder.getInstance().primaryVideoFeed,
            true
        )
        DJILidarLiveViewDataProcessor.getInstance().bindView(point_cloud_view_surface)
        DJILidarLiveViewDataProcessor.getInstance().setLidarIndex(0)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        DJILidarLiveViewDataProcessor.getInstance().destroy()
    }

    private fun initUI(context: Context) {
        isClickable = true
        orientation = VERTICAL
        val layoutInflater =
            context.getSystemService(Service.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        layoutInflater.inflate(R.layout.view_lidar, this, true)

        btn_set_video_source.setOnClickListener(this)
        btn_update_lidar.setOnClickListener(this)
        btn_send_command_to_remote.setOnClickListener(this)
        btn_start_read_point_cloud_live_view_data.setOnClickListener(this)
        btn_stop_read_point_cloud_live_view_data.setOnClickListener(this)
        btn_set_point_cloud_live_view_display_mode.setOnClickListener(this)
        btn_fresh_point_cloud_live_view_data_processed_buffers.setOnClickListener(this)
        btn_clear_point_cloud_live_view_data_processed_buffers.setOnClickListener(this)
        btn_set_point_cloud_visible_light_pixel_btn.setOnClickListener(this)
        btn_set_point_cloud_color_mode.setOnClickListener(this)
    }

    private fun startReadPointCloudLiveViewData() {
        currentLidar?.startReadPointCloudLiveViewData {
            ToastUtils.setResultToToast(it?.description ?: "Success")
        }
    }

    private fun stopReadPointCloudLiveViewData() {
        currentLidar?.stopReadPointCloudLiveViewData {
            ToastUtils.setResultToToast(it?.description ?: "Success")
        }
    }

    private fun sendCommandToRemote() {
        val commandActions = DJILidarPointCloudRecord.getValues()
        val recordingRunnable = Runnable {
            currentLidar!!.pointCloudRecord(commandActions[indexChosen[0]]) {
                ToastUtils.setResultToToast(it?.description ?: "Success")
            }
            resetIndex()
        }
        initPopupNumberPicker(ViewHelper.makeList(commandActions), recordingRunnable)
    }

    private fun freshPointCloudLiveViewDataProcessedBuffers() {
        DJILidarLiveViewDataProcessor.getInstance().freshPointCloudLiveViewDataProcessedBuffers()
    }

    private fun clearPointCloudLiveViewDataProcessedBuffers() {
        DJILidarLiveViewDataProcessor.getInstance().clearPointCloudLiveViewDataProcessedBuffers()
    }

    private fun setPointCloudLiveViewDisplayMode() {
        val modes = PointCloudDisplayMode.values()
        val r = Runnable {
            pointCloudDisplayMode = modes[indexChosen[0]]
            DJILidarLiveViewDataProcessor.getInstance()
                .setPointCloudLiveViewDisplayMode(pointCloudDisplayMode)
            resetIndex()
        }
        initPopupNumberPicker(ViewHelper.makeList(modes), r)
    }

    private fun setPointCloudVisibleLightPixel() {
        val visibleLightPixels = arrayOf(
            DJILidarPointCloudVisibleLightPixelMode.VISIBLE_LIGHT_PIXEL_OFF,
            DJILidarPointCloudVisibleLightPixelMode.VISIBLE_LIGHT_PIXEL_ON_TIMED_SHOT_OFF,
            DJILidarPointCloudVisibleLightPixelMode.VISIBLE_LIGHT_PIXEL_ON_TIMED_SHOT_ON
        )
        val visibleRunnable = Runnable {
            lidarPointCloudVisibleLightPixelMode =
                DJILidarPointCloudVisibleLightPixelMode.find(indexChosen[0])
            currentLidar!!.setPointCloudVisibleLightPixel(lidarPointCloudVisibleLightPixelMode) {
                ToastUtils.setResultToToast(it?.description ?: "Success")
            }
            resetIndex()
        }
        initPopupNumberPicker(ViewHelper.makeList(visibleLightPixels), visibleRunnable)
    }

    private fun setPointCloudColorMode() {
        val modes = PointCloudColorMode.values()
        val r = Runnable {
            pointCloudColorMode = modes[indexChosen[0]]
            DJILidarLiveViewDataProcessor.getInstance()
                .setPointCloudLiveViewColorMode(modes[indexChosen[0]])
            resetIndex()
        }
        initPopupNumberPicker(ViewHelper.makeList(modes), r)
    }

    private fun initPopupNumberPicker(list: ArrayList<String>, r: Runnable) {
        mPopupNumberPicker = PopupNumberPicker(context, list, { pos1, pos2 ->
            mPopupNumberPicker!!.dismiss()
            mPopupNumberPicker = null
            indexChosen[0] = pos1
            handler.post(r)
        }, 250, 200, 0)
        mPopupNumberPicker?.showAtLocation(this, Gravity.CENTER, 0, 0)
    }

    private fun initPopupNumberPicker(
        list1: ArrayList<String>,
        list2: ArrayList<String>,
        r: Runnable
    ) {
        mPopupDoubleNumberPicker = PopupNumberPickerDouble(
            context, list1, null, list2, null,
            { pos1, pos2 ->
                mPopupDoubleNumberPicker!!.dismiss()
                mPopupDoubleNumberPicker = null
                indexChosen[0] = pos1
                indexChosen[1] = pos2
                handler.post(r)
            }, 500, 200, 0
        )
        mPopupDoubleNumberPicker?.showAtLocation(
            this,
            Gravity.CENTER,
            0,
            0
        )
    }

    private fun setVideoSource() {
        if (DJISDKManager.getInstance().product == null) {
            ToastUtils.setResultToToast("Disconnect!")
            return
        }

        val airLink = DJISDKManager.getInstance().product.airLink
        if (airLink == null) {
            ToastUtils.setResultToToast("Disconnect! airLink")
            return
        }

        val ocuSyncLink = airLink.ocuSyncLink
        if (ocuSyncLink == null) {
            ToastUtils.setResultToToast("Disconnect! ocuSyncLink")
            return
        }

        val videos = ArrayList(
            Arrays.asList(
                PhysicalSource.LEFT_CAM.name,
                PhysicalSource.RIGHT_CAM.name,
                PhysicalSource.TOP_CAM.name,
                PhysicalSource.FPV_CAM.name
            )
        )

        val videoIndex = arrayOf(
            PhysicalSource.LEFT_CAM,
            PhysicalSource.RIGHT_CAM,
            PhysicalSource.TOP_CAM,
            PhysicalSource.FPV_CAM
        )

        val r = Runnable {
            ToastUtils.setResultToToast("primarySource:" + videoIndex[indexChosen[0]] + " secondarySource:" + videoIndex[indexChosen[1]])
            ocuSyncLink.assignSourceToPrimaryChannel(
                videoIndex[indexChosen[0]],
                videoIndex[indexChosen[1]]
            ) {
                ToastUtils.setResultToToast(it?.description ?: "Success")
            }
            resetIndex()
        }
        initPopupNumberPicker(videos, videos, r)
    }

    private fun updatePointCloudInfo() {
        val builder = StringBuilder()
        builder.append("PointCloudColorMode:").append(pointCloudColorMode)
        builder.append("\n")
        builder.append("DJILidarPointCloudVisibleLightPixelMode:")
            .append(lidarPointCloudVisibleLightPixelMode)
        builder.append("\n")
        builder.append("PointCloudDisplayMode:").append(pointCloudDisplayMode)
        builder.append("\n")
        builder.append("recordingStatus:").append(recordingStatus)
        builder.append("\n")
        builder.append("RecordingTime:").append(recordingTime)
        builder.append("\n")
        handler.post {
            lidar_info_view.text = builder.toString()
        }
    }

    private fun resetIndex() {
        indexChosen[0] = -1
        indexChosen[1] = -1
        indexChosen[2] = -1
    }

    private fun initLidar(index: Int) {
        var mProduct = DJISDKManager.getInstance().product
        if (mProduct == null) {
            ToastUtils.setResultToToast("Lidar Disconnect")
            return
        }
        if (lidars == null) {
            ToastUtils.setResultToToast("Lidar Disconnect")
            return
        }
        val lidars = (mProduct as Aircraft).lidars
        for (l in lidars) {
            if (l.index == index && l.isConnected) {
                currentLidar = l
            }
        }
    }

    private fun initListener(lidarIndex: Int) {
        if (currentLidar == null) {
            return
        }
        DJILidarLiveViewDataProcessor.getInstance().setLidarIndex(lidarIndex)
        currentLidar?.addPointCloudLiveViewDataListener(object : DJIPointCloudLiveDataListener {
            override fun onReceiveLiveViewData(data: Array<PointCloudLiveViewData>, length: Int) {
                DJILidarLiveViewDataProcessor.getInstance().addPointCloudLiveViewData(data, length)
            }

            override fun onError(error: DJIError) {
                ToastUtils.setResultToToast(error?.description ?: "Success")
            }
        })
        pointCloudStatusListener = object : DJIPointCloudStatusListener {
            override fun onPointCloudRecordStatusChange(newStatus: RecordingStatus) {
                recordingStatus = newStatus
                updatePointCloudInfo()
            }

            override fun onPointCloudRecordStatusRecordingTimeChange(newRecordingTime: Long) {
                recordingTime = newRecordingTime
                updatePointCloudInfo()
            }
        }
        currentLidar?.addPointCloudStatusListener(pointCloudStatusListener)
    }

    private fun unInitListener() {
        currentLidar?.removePointCloudLiveViewDataListener(null)
        currentLidar?.removePointCloudStatusListener(pointCloudStatusListener)
    }

    private fun updateLidar(lidarIndex: Int) {
        unInitListener()
        initLidar(lidarIndex)
        initListener(lidarIndex)
    }

    override fun onClick(v: View?) {
        if (currentLidar == null) {
            updateLidar(0)
        }
        if (currentLidar == null) {
            ToastUtils.setResultToToast("Lidar Disconnect")
            return
        }
        when (v?.id) {
            R.id.btn_set_video_source -> setVideoSource()
            R.id.btn_update_lidar -> updateLidar(0)
            R.id.btn_send_command_to_remote -> sendCommandToRemote()
            R.id.btn_start_read_point_cloud_live_view_data -> startReadPointCloudLiveViewData()
            R.id.btn_stop_read_point_cloud_live_view_data -> stopReadPointCloudLiveViewData()
            R.id.btn_set_point_cloud_live_view_display_mode -> setPointCloudLiveViewDisplayMode()
            R.id.btn_fresh_point_cloud_live_view_data_processed_buffers -> freshPointCloudLiveViewDataProcessedBuffers()
            R.id.btn_clear_point_cloud_live_view_data_processed_buffers -> clearPointCloudLiveViewDataProcessedBuffers()
            R.id.btn_set_point_cloud_visible_light_pixel_btn -> setPointCloudVisibleLightPixel()
            R.id.btn_set_point_cloud_color_mode -> setPointCloudColorMode()
        }
    }


    override fun getDescription() = R.string.component_listview_lidar_view

    override fun getHint() = this.javaClass.simpleName + ".java"
}