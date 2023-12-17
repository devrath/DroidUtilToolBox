package com.istudio.utils

import android.app.Application
import com.istudio.lib_utils.SDKConfig

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize the SDK here
        initializeSDK()
    }

    private fun initializeSDK() {
        SDKConfig.initContext( this)
    }

}