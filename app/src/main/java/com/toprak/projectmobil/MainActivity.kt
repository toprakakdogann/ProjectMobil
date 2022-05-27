package com.toprak.projectmobil

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buton = findViewById<Button>(R.id.buton)
        buton.setOnClickListener {

            val isim = findViewById<EditText>(R.id.ad).text.toString()
            val numara = findViewById<EditText>(R.id.numara).text.toString()

            if(isim == "Toprak AKDOGAN" && numara == "02185076003") {
                val giris = Intent(applicationContext,Menu::class.java)
                startActivity(giris)
                Toast.makeText(this, "Giriş Yapıldı", Toast.LENGTH_SHORT).show();
            } else if(TextUtils.isEmpty(isim)) {
                val ad = AlertDialog.Builder(this)
                ad.setTitle("Hata")
                ad.setMessage("Bu alanlar boş bırakılamaz").show()
            }
            else if(TextUtils.isEmpty(numara)) {
                val ad = AlertDialog.Builder(this)
                ad.setTitle("Hata")
                ad.setMessage("Bu alanlar boş bırakılamaz").show()
            }
            else {
                val ad = AlertDialog.Builder(this)
                ad.setTitle("Hata")
                ad.setMessage("İsim veya numara bilgisi yanlış")
                ad.setPositiveButton("Çık"){DialogInterface, i->
                    moveTaskToBack(true);
                    exitProcess(-1)
                }
                ad.setNeutralButton("Yeniden Dene"){DialogInterface, i ->
                    Intent(applicationContext,MainActivity::class.java)
                }    .show()
            }
        }
    }
}
