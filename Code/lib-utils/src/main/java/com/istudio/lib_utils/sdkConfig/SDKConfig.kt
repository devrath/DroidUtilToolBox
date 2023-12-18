package com.istudio.lib_utils.sdkConfig

import android.content.Context

object SDKConfig {

    // Context
    private lateinit var context: Context

    /** ******************** Context ******************** **/
    fun initContext(context: Context) { SDKConfig.context = context }

    fun getContext(): Context {
        if (!SDKConfig::context.isInitialized) {
            throw UninitializedPropertyAccessException("Util library is not initialized")
        }
        return context
    }
    /** ******************** Context ******************** **/

}
