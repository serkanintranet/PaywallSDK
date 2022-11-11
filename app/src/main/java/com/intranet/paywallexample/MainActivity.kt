package com.intranet.paywallexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intranet.paywalllibrary.PaywallBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val paywallBuilder = PaywallBuilder.Builder()
            .apiKey("")
            .apiClient("")
            .build()

        paywallBuilder.getVersion(this)
        paywallBuilder.start3D(this)
        paywallBuilder.end3D(this)
    }
}