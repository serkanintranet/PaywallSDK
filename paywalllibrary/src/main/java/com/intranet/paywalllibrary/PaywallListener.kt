package com.intranet.paywalllibrary

import android.text.BoringLayout

interface PaywallListener {
    fun onSuccess(type: Int, response: String)
    fun onError(type: Int, message: String)
}