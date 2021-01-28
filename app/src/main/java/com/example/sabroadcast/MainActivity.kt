package com.example.sabroadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myreceiver = MyReceiver()
        var myIntentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")
        registerReceiver(myreceiver,myIntentFilter)


        var myRecData = MyRecData()
        var recIntentFilter = IntentFilter("com.ansari")
        registerReceiver(myRecData,recIntentFilter)



            buttonSend.setOnClickListener {
                var mydata = editTextData.text.toString()
                var myintent = Intent("com.ansari")
                myintent.putExtra("key1",mydata)
                sendBroadcast(myintent)
            }
    }
}