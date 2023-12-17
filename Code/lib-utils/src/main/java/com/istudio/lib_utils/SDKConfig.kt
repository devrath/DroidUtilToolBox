package com.istudio.lib_utils

import android.content.Context

object SDKConfig {

    // Context
    private lateinit var context: Context

    /** ******************** Context ******************** **/
    fun initContext(context: Context) { this.context = context }

    fun getContext(): Context {
        if (!::context.isInitialized) {
            throw UninitializedPropertyAccessException("Util library is not initialized")
        }
        return context
    }
    /** ******************** Context ******************** **/



}
