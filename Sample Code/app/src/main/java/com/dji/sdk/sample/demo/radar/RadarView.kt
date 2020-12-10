package com.dji.sdk.sample.demo.radar

import android.app.Service
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.dji.frame.util.V_JsonUtil
import com.dji.sdk.sample.R
import com.dji.sdk.sample.internal.controller.DJISampleApplication
import com.dji.sdk.sample.internal.utils.Helper
import com.dji.sdk.sample.internal.utils.PopupUtils
import com.dji.sdk.sample.internal.utils.ToastUtils
import com.dji.sdk.sample.internal.view.PresentableView
import dji.common.error.DJIError
import dji.common.flightcontroller.flightassistant.PerceptionInformation
import dji.common.util.CommonCallbacks
import dji.common.util.CommonCallbacks.CompletionCallbackWith
import dji.sdk.products.Aircraft
import dji.sdk.radar.Radar
import kotlinx.coroutines.*
import java.lang.Runnable
import java.util.*

/**
 * class for radar sample
 */
class RadarView(context: Context?) : LinearLayout(context), PresentableView, View.OnClickListener {

    private lateinit var radarInfoText: TextView
    private var mRadar: Radar? = null

    init {
        initUI(context)
        initRadar()
    }

    fun initUI(context: Context?) {
        isClickable = true
        orientation = VERTICAL
        val layoutInflater = context!!.getSystemService(Service.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        layoutInflater.inflate(R.layout.view_radar, this, true)
        radarInfoText = findViewById(R.id.radar_info)
        findViewById<View>(R.id.btn_get_upward_avoidance).setOnClickListener(this)
        findViewById<View>(R.id.btn_set_upward_avoidance).setOnClickListener(this)
        findViewById<View>(R.id.btn_get_horizontal_avoidance).setOnClickListener(this)
        findViewById<View>(R.id.btn_set_horizontal_avoidance).setOnClickListener(this)
    }

    private fun initRadar() {
        val product = DJISampleApplication.getProductInstance();
        if (product != null && product is Aircraft && product.radar != null) {
            mRadar = product.radar as Radar
        }
        mRadar?.setRadarPerceptionInformationCallback(object : CompletionCallbackWith<PerceptionInformation> {
            override fun onSuccess(perceptionInformation: PerceptionInformation?) {
                radarInfoText.text = V_JsonUtil.toJson(perceptionInformation)
            }

            override fun onFailure(djiError: DJIError) {
                radarInfoText.text = djiError.errorCode.toString()
            }
        })
    }

    private fun getUpwardRadarObstacleAvoidanceEnabled() {
        mRadar?.getUpwardRadarObstacleAvoidanceEnabled(object : CompletionCallbackWith<Boolean> {
            override fun onSuccess(enable: Boolean?) {
                ToastUtils.setResultToToast("Success,Upward Radar Obstacle Avoidance Enabled:$enable")
            }

            override fun onFailure(djiError: DJIError) {
                ToastUtils.setResultToToast("Failure,Upward Radar Obstacle Avoidance Enabled:${djiError.description}")
            }
        })
    }

    private fun setUpwardRadarObstacleAvoidanceEnabled() {
        val enableList = listOf(true, false)
        PopupUtils.initPopupNumberPicker(Helper.makeList(enableList), Runnable {
            if (PopupUtils.index[0] != -1) {
                enableList[PopupUtils.index[0]].apply {
                    mRadar?.setUpwardRadarObstacleAvoidanceEnabled(this) {
                        if (it != null)
                            ToastUtils.setResultToToast("Failed,Upward Radar Obstacle Avoidance Enabled:$this,Error is:${it.description}")
                        else
                            ToastUtils.setResultToToast("Success,Upward Radar Obstacle Avoidance Enabled:$this")
                    }
                }
            }
            PopupUtils.resetIndex()
        }, this)
    }

    private fun getHorizontalRadarObstacleAvoidanceEnabled() {
        mRadar?.getHorizontalRadarObstacleAvoidanceEnabled(object : CompletionCallbackWith<Boolean> {
            override fun onSuccess(enable: Boolean?) {
                ToastUtils.setResultToToast("Success,Horizontal Radar Obstacle Avoidance Enabled:$enable")
            }

            override fun onFailure(djiError: DJIError) {
                ToastUtils.setResultToToast("Failure,Horizontal Radar Obstacle Avoidance Enabled:${djiError.description}")
            }
        })
    }

    private fun setHorizontalRadarObstacleAvoidanceEnabled() {
        val enableList = listOf(true, false)
        PopupUtils.initPopupNumberPicker(Helper.makeList(enableList), Runnable {
            if (PopupUtils.index[0] != -1) {
                enableList[PopupUtils.index[0]].apply {
                    mRadar?.setHorizontalRadarObstacleAvoidanceEnabled(this) {
                        if (it != null)
                            ToastUtils.setResultToToast("Failed,Horizontal Radar Obstacle Avoidance Enabled:$this,Error is:${it.description}")
                        else
                            ToastUtils.setResultToToast("Success,Horizontal Radar Obstacle Avoidance Enabled:$this")
                    }
                }
            }
            PopupUtils.resetIndex()
        }, this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_get_upward_avoidance -> getUpwardRadarObstacleAvoidanceEnabled()
            R.id.btn_set_upward_avoidance -> setUpwardRadarObstacleAvoidanceEnabled()
            R.id.btn_get_horizontal_avoidance -> getHorizontalRadarObstacleAvoidanceEnabled()
            R.id.btn_set_horizontal_avoidance -> setHorizontalRadarObstacleAvoidanceEnabled()
        }
    }

    override fun getDescription(): Int = R.string.component_listview_radar

    override fun getHint(): String = this.javaClass.simpleName
}
