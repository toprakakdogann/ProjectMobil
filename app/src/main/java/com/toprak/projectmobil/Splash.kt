package com.toprak.projectmobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val ad = findViewById<TextView>(R.id.ad)
        val anim = AnimationUtils.loadAnimation(applicationContext,R.anim.animation)

        ad.startAnimation(anim)
        var counter = findViewById<TextView>(R.id.counter)
        var geriSayma = object : CountDownTimer(6000,1000) {
            override fun onTick(p0: Long) {
                counter.text = (p0/1000).toString()
            }
            override fun onFinish() {

            }
        }
        geriSayma.start()

        Handler().postDelayed({
            val gecis = Intent(applicationContext, MainActivity::class.java)
            startActivity(gecis)
            finish()
        }, 5000)
    }
}

