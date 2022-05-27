package com.toprak.projectmobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.widget.*


class BirazHareket : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biraz_hareket)

        var button = findViewById<Button>(R.id.button1)

        var imageV = findViewById<ImageView>(R.id.logo)
        var buttonV = findViewById<Button>(R.id.suruklebtn)
        var viewV = findViewById<TextView>(R.id.surukleview)
        var editV = findViewById<EditText>(R.id.surukletxt)


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

        var listener1 = View.OnTouchListener(function = {view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2

                Toast.makeText(applicationContext,"ImageView konumu değişti.",Toast.LENGTH_SHORT).show()

            }

            true

        })
        var listener2 = View.OnTouchListener(function = {view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2

                Toast.makeText(applicationContext,"Button konumu değişti.",Toast.LENGTH_SHORT).show()

            }

            true

        })
        var listener3 = View.OnTouchListener(function = {view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2

                Toast.makeText(applicationContext,"TextView konumu değişti.",Toast.LENGTH_SHORT).show()

            }

            true

        })
        var listener4 = View.OnTouchListener(function = {view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height/2
                view.x = motionEvent.rawX - view.width/2

                Toast.makeText(applicationContext,"EditText konumu değişti.",Toast.LENGTH_SHORT).show()

            }

            true

        })

        imageV.setOnTouchListener(listener1)
        buttonV.setOnTouchListener(listener2)
        viewV.setOnTouchListener(listener3)
        editV.setOnTouchListener(listener4)


    }
}