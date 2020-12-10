package com.dji.sdk.sample.demo.useraccount

import android.app.Service
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import butterknife.OnClick
import com.dji.sdk.sample.R
import com.dji.sdk.sample.internal.utils.ToastUtils
import com.dji.sdk.sample.internal.view.PresentableView
import dji.common.error.DJIError
import dji.common.util.CommonCallbacks.CompletionCallbackWith
import dji.sdk.sdkmanager.DJISDKManager
import dji.sdk.sdkmanager.LDMManager.LDMCallback

class LDMView(context: Context?) : LinearLayout(context), PresentableView, View.OnClickListener {

    private lateinit var ldmInfoText: TextView
    private var isLDMEnable: Boolean = false
    private var isLDMSupport: Boolean = false

    init {
        initUI(context)
        initListener()
    }

    private fun initUI(context: Context?) {
        isClickable = true
        orientation = VERTICAL
        val layoutInflater = context!!.getSystemService(Service.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        layoutInflater.inflate(R.layout.view_ldm, this, true)
        ldmInfoText = findViewById(R.id.ldm_info)
        findViewById<View>(R.id.btn_enable_ldm).setOnClickListener(this)
        findViewById<View>(R.id.btn_disable_ldm).setOnClickListener(this)
        findViewById<View>(R.id.btn_enable_rtk_network).setOnClickListener(this)
        findViewById<View>(R.id.btn_disable_rtk_network).setOnClickListener(this)
        findViewById<View>(R.id.btn_is_rtk_network_enabled).setOnClickListener(this)
        findViewById<View>(R.id.btn_get_ldm_license).setOnClickListener(this)
    }

    private fun initListener() {
        DJISDKManager.getInstance().ldmManager.setCallback(object : LDMCallback {
            override fun onLDMEnabledChange(isEnabled: Boolean) {
                isLDMEnable = isEnabled;
                handler.post { updateLdmInfo() }
            }

            override fun onLDMSupportedChange(isSupported: Boolean) {
                isLDMSupport = isSupported;
                handler.post { updateLdmInfo() }
            }
        })
    }

    fun disableLDM() {
        DJISDKManager.getInstance().ldmManager.disableLDM()
        ToastUtils.setResultToToast("LDM Disabled!")
    }

    fun enableLDM() {
        DJISDKManager.getInstance().ldmManager.enableLDM {
            if (it == null)
                ToastUtils.setResultToToast("LDM Enabled")
            else
                ToastUtils.setResultToToast("Enable LDM failed=${it.description}")
        }
    }

    fun enableRTKNetwork() {
        val error = DJISDKManager.getInstance().ldmManager.setRTKNetworkServiceEnabled(true)
        ToastUtils.setResultToToast("enableRTKNetwork " + if (error == null) "success" else "error=" + error.description)
    }

    fun disableRTKNetwork() {
        val error = DJISDKManager.getInstance().ldmManager.setRTKNetworkServiceEnabled(false)
        ToastUtils.setResultToToast("disableRTKNetwork " + if (error == null) "success" else "error=" + error.description)
    }

    fun isRTKNetworkEnabled() {
        ToastUtils.setResultToToast("isRTKNetworkServiceEnabled: " + DJISDKManager.getInstance().ldmManager.isRTKNetworkServiceEnabled)
    }

    fun getLdmLicense() {
        DJISDKManager.getInstance().ldmManager.getLDMSupported(object : CompletionCallbackWith<Boolean> {
            override fun onSuccess(aBoolean: Boolean) {
                ToastUtils.setResultToToast("getLdmLicense result=$aBoolean")
            }

            override fun onFailure(error: DJIError) {
                ToastUtils.setResultToToast("getLdmLicense error=" + error.description)
            }
        })
    }

    private fun updateLdmInfo() {
        ldmInfoText.text = "LDM enabled:$isLDMEnable,LDM supported:$isLDMSupport"
    }

    override fun getDescription(): Int = R.string.component_listview_ldm

    override fun getHint(): String = this.javaClass.simpleName

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_enable_ldm -> enableLDM()
            R.id.btn_disable_ldm -> disableLDM()
            R.id.btn_enable_rtk_network -> enableRTKNetwork()
            R.id.btn_disable_rtk_network -> disableRTKNetwork()
            R.id.btn_is_rtk_network_enabled -> isRTKNetworkEnabled()
            R.id.btn_get_ldm_license -> getLdmLicense()
        }
    }
}