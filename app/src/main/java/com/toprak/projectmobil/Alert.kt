package com.toprak.projectmobil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class Alert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        var counter = findViewById<TextView>(R.id.counter1)
        var geriSayma = object : CountDownTimer(4000,1000) {
            override fun onTick(p0: Long) {
                counter.text = (p0/1000).toString()
            }
            override fun onFinish() {

            }
        }
        geriSayma.start()


    }
}