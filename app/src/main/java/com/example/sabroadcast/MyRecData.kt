package com.example.sabroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyRecData : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

       var data = intent?.extras?.getString("key1")
        Toast.makeText(context, "data received $data",Toast.LENGTH_LONG).show()

    }
}