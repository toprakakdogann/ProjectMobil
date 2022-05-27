package com.toprak.projectmobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu

class Renkler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_renkler)

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
    }
}