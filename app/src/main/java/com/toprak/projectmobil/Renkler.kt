package com.toprak.projectmobil

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Renkler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_renkler)

        var numara = findViewById<TextView>(R.id.numara)
        var button1 = findViewById<Button>(R.id.button1)
        var renk = findViewById<TextView>(R.id.renk)
        var arkaplan = findViewById<TextView>(R.id.arkaplan)
        var fragment = findViewById<TextView>(R.id.fragment)
        var yazirengi_spinner = findViewById<Spinner>(R.id.spinner)
        var arkaplanrengi_spinner = findViewById<Spinner>(R.id.spinner2)
        var fragmentrengi_spinner = findViewById<Spinner>(R.id.spinner3)
        var isim = findViewById<TextView>(R.id.isim)
        var fragment_arkaplan = findViewById<LinearLayout>(R.id.fragmentContainerView)

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
        var renkler = arrayOf(
            "Renk Seçiniz",
            "Turkuaz",
            "Okul otobüsü sarısı",
            "Pas rengi",
            //wikipedia da r ile renk olmadığı için r harfini atladım
            "Açık yeşil",
            "Kabak rengi"
        )
        var adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, renkler)

        yazirengi_spinner.adapter = adapter
        yazirengi_spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {

                when (parent.getItemAtPosition(position).toString()) {
                    "Turkuaz" -> {
                        isim.setTextColor(Color.parseColor("#30D5C8"))
                        numara.setTextColor(Color.parseColor("#30D5C8"))

                    }
                    "Okul otobüsü sarısı" -> {
                        isim.setTextColor(Color.parseColor("#FFD800"))
                        numara.setTextColor(Color.parseColor("#FFD800"))

                    }
                    "Pas rengi" -> {
                        isim.setTextColor(Color.parseColor("#B7410E"))
                        numara.setTextColor(Color.parseColor("#B7410E"))

                    }
                    "Açık yeşil" -> {
                        isim.setTextColor(Color.parseColor("#66FF00"))
                        numara.setTextColor(Color.parseColor("#66FF00"))

                    }
                    "Kabak rengi" -> {
                        isim.setTextColor(Color.parseColor("#FF7518"))
                        numara.setTextColor(Color.parseColor("#FF7518"))

                    }

                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }


        arkaplanrengi_spinner.adapter = adapter
        arkaplanrengi_spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long

            ) {
                when (parent.getItemAtPosition(position).toString()) {
                    "Turkuaz" -> {
                        isim.setBackgroundColor(Color.parseColor("#30D5C8"))
                        numara.setBackgroundColor(Color.parseColor("#30D5C8"))

                    }
                    "Okul otobüsü sarısı" -> {
                        isim.setBackgroundColor(Color.parseColor("#FFD800"))
                        numara.setBackgroundColor(Color.parseColor("#FFD800"))

                    }
                    "Pas rengi" -> {
                        isim.setBackgroundColor(Color.parseColor("#B7410E"))
                        numara.setBackgroundColor(Color.parseColor("#B7410E"))

                    }
                    "Açık yeşil" -> {
                        isim.setBackgroundColor(Color.parseColor("#66FF00"))
                        numara.setBackgroundColor(Color.parseColor("#66FF00"))

                    }
                    "Kabak rengi" -> {
                        isim.setBackgroundColor(Color.parseColor("#FF7518"))
                        numara.setBackgroundColor(Color.parseColor("#FF7518"))

                    }

                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        fragmentrengi_spinner.adapter = adapter
        fragmentrengi_spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {

                when (parent.getItemAtPosition(position).toString()) {
                    "Turkuaz" -> {
                        fragment_arkaplan.setBackgroundColor(Color.parseColor("#30D5C8"))

                    }
                    "Okul otobüsü sarısı" -> {
                        fragment_arkaplan.setBackgroundColor(Color.parseColor("#FFD800"))

                    }
                    "Pas rengi" -> {
                        fragment_arkaplan.setBackgroundColor(Color.parseColor("#B7410E"))

                    }
                    "Açık yeşil" -> {
                        fragment_arkaplan.setBackgroundColor(Color.parseColor("#66FF00"))

                    }
                    "Kabak rengi" -> {
                        fragment_arkaplan.setBackgroundColor(Color.parseColor("#FF7518"))

                    }

                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }
}