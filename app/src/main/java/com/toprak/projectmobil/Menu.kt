package com.toprak.projectmobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import com.google.android.material.snackbar.Snackbar
import java.util.*
import kotlin.concurrent.timerTask
import kotlin.system.exitProcess

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var button = findViewById<Button>(R.id.button1)
        button.setOnClickListener{
            val acilirMenu = PopupMenu(this,button)
            acilirMenu.menuInflater.inflate(R.menu.popupmenu,acilirMenu.menu)
            acilirMenu.setOnMenuItemClickListener { i->
                when(i.itemId) {
                    R.id.anaMenu -> {
                        val anaMenuAc = Intent(applicationContext,Menu::class.java)
                        startActivity(anaMenuAc)
                        true
                    }
                    R.id.renkler -> {
                        val renklerAc = Intent(applicationContext,Renkler::class.java)
                        startActivity(renklerAc)
                        true
                    }
                    R.id.hareket -> {
                        val hareketAc = Intent(applicationContext,BirazHareket::class.java)
                        startActivity(hareketAc)
                        true
                    }
                    R.id.gorunur -> {
                        val gorunurAc = Intent(applicationContext,GorunurGorunmez::class.java)
                        startActivity(gorunurAc)
                        true
                    }
                    R.id.toast -> {
                        val toastAc = Intent(applicationContext,ToastOlusturma::class.java)
                        startActivity(toastAc)
                        true
                    }

                    else -> false
                }
            }
            acilirMenu.show()
        }
        val imageView = findViewById<ImageView>(R.id.close)
        imageView.setOnClickListener{
            Snackbar.make(it,"Uygulama kapatılıyor", Snackbar.LENGTH_SHORT)
                .setAction("", View.OnClickListener {
                    moveTaskToBack(true);
                    exitProcess(-1)
                }).setDuration(3000)
                .show()

            val timer = Timer()
            timer.schedule(timerTask {
                moveTaskToBack(true);
                exitProcess(-1)
            }, 3100)



        }


    }
}