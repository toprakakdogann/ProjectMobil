package com.toprak.projectmobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible

class GorunurGorunmez : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gorunur_gorunmez)


        var button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val acilirMenu = PopupMenu(this, button)
            acilirMenu.menuInflater.inflate(R.menu.popupmenu, acilirMenu.menu)
            acilirMenu.setOnMenuItemClickListener { i ->
                when (i.itemId) {
                    R.id.anaMenu -> {
                        val anaMenuAc = Intent(applicationContext, Menu::class.java)
                        startActivity(anaMenuAc)
                        true
                    }
                    R.id.renkler -> {
                        val renklerAc = Intent(applicationContext, Renkler::class.java)
                        startActivity(renklerAc)
                        true
                    }
                    R.id.hareket -> {
                        val hareketAc = Intent(applicationContext, BirazHareket::class.java)
                        startActivity(hareketAc)
                        true
                    }
                    R.id.gorunur -> {
                        val gorunurAc = Intent(applicationContext, GorunurGorunmez::class.java)
                        startActivity(gorunurAc)
                        true
                    }
                    R.id.toast -> {
                        val toastAc = Intent(applicationContext, ToastOlusturma::class.java)
                        startActivity(toastAc)
                        true
                    }

                    else -> false
                }
            }
            acilirMenu.show()
        }

        var btn = findViewById<Button>(R.id.btn)
        var btn1 = findViewById<Button>(R.id.btn1)
        var cb = findViewById<CheckBox>(R.id.cb)
        var cb1 = findViewById<CheckBox>(R.id.cb1)
        var tv = findViewById<TextView>(R.id.tv)
        var tv1 = findViewById<TextView>(R.id.tv1)
        var rb = findViewById<RadioButton>(R.id.rb)
        var rb1 = findViewById<RadioButton>(R.id.rb1)

        btn.setOnClickListener {
            if (btn1.getVisibility() == View.VISIBLE) {
                btn1.setVisibility(View.INVISIBLE);
            } else {
                btn1.setVisibility(View.VISIBLE);
            }
        }
        btn1.setOnClickListener {
            if (btn.getVisibility() == View.VISIBLE) {
                btn.setVisibility(View.INVISIBLE);
            } else {
                btn.setVisibility(View.VISIBLE);
            }
        }
        tv.setOnClickListener {
            if (tv1.getVisibility() == View.VISIBLE) {
                tv1.setVisibility(View.INVISIBLE);
            } else {
                tv1.setVisibility(View.VISIBLE);
            }
        }
        tv1.setOnClickListener {
            if (tv.getVisibility() == View.VISIBLE) {
                tv.setVisibility(View.INVISIBLE);
            } else {
                tv.setVisibility(View.VISIBLE);
            }
        }
        rb.setOnClickListener {
            if (rb1.getVisibility() == View.VISIBLE) {
                rb1.setVisibility(View.INVISIBLE);
            } else {
                rb1.setVisibility(View.VISIBLE);
            }
        }
        rb1.setOnClickListener {
            if (rb.getVisibility() == View.VISIBLE) {
                rb.setVisibility(View.INVISIBLE);
            } else {
                rb.setVisibility(View.VISIBLE);
            }
        }
        cb.setOnClickListener {
            if (cb1.getVisibility() == View.VISIBLE) {
                cb1.setVisibility(View.INVISIBLE);
            } else {
                cb1.setVisibility(View.VISIBLE);
            }
        }
        cb1.setOnClickListener {
            if (cb.getVisibility() == View.VISIBLE) {
                cb.setVisibility(View.INVISIBLE);
            } else {
                cb.setVisibility(View.VISIBLE);
            }
        }

    }

}


