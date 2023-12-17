package com.istudio.utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.istudio.lib_utils.network.ConnectivityUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this?.let {
            Toast.makeText(
                it,ConnectivityUtils.isNetworkAvailable().toString(),Toast.LENGTH_LONG).show()
        }


    }
}