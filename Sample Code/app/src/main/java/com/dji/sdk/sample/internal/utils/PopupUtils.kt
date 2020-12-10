package com.dji.sdk.sample.internal.utils

import android.view.Gravity
import android.view.View
import com.dji.sdk.sample.internal.view.PopupNumberPicker
import java.util.ArrayList

object PopupUtils {

    var index = intArrayOf(-1, -1, -1)

    var popupNumberPicker: PopupNumberPicker? = null

    fun resetIndex() {
        index[0] = -1
        index[1] = -1
        index[2] = -1
    }

    fun initPopupNumberPicker(list: ArrayList<String>, r: Runnable, view: View) {
        popupNumberPicker = PopupNumberPicker(view.context, list, { pos1, pos2 ->
            popupNumberPicker?.dismiss()
            popupNumberPicker = null
            index[0] = pos1
            view.handler.post(r)
        }, 300, 200, 0)
        popupNumberPicker?.showAtLocation(view, Gravity.CENTER, 0, 0)
    }
}