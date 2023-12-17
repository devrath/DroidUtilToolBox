package com.istudio.utils

import android.app.Application
import androidx.startup.AppInitializer
import com.istudio.lib_utils.sdkConfig.SDKInitializer

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize the SDK here
        initializeSDK()
    }

    private fun initializeSDK() {
        AppInitializer.getInstance(this).initializeComponent(SDKInitializer::class.java)
    }

}