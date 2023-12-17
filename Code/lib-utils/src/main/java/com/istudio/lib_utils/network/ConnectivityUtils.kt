package com.istudio.lib_utils.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import com.istudio.lib_utils.SDKConfig

object ConnectivityUtils {
    
    /**
     * Checks the network connectivity status.
     *
     * This function checks whether the device has an active network connection.
     *
     * @param context The context used to obtain the [ConnectivityManager] service.
     * @return `true` if the device has network connectivity, `false` otherwise.
     */
    fun isNetworkAvailable(): Boolean {
        val connectivityManager =
            SDKConfig.getContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val networkCapabilities = connectivityManager.activeNetwork ?: return false
            val actNw = connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false

            return when {
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                else -> false
            }
        } else {
            // For devices running versions below M
            @Suppress("DEPRECATION")
            val networkInfo = connectivityManager.activeNetworkInfo
            return networkInfo?.isConnected == true
        }
    }

}