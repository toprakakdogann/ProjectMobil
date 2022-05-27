package com.toprak.projectmobil

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ToastOlusturma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_olusturma)

        val btn = findViewById<Button>(R.id.button1);

        val text = findViewById<EditText>(R.id.isim)
        val radioGroup = findViewById<RadioGroup>(R.id.radiogroup1)

        val button = findViewById<Button>(R.id.toastmesajbutton1)
        button.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedId);
            val text_radio = radioButton.text
            var text_isim = text.text.toString()

            if(text_radio.equals("1")){
                createToast(text_isim,R.drawable.logo)
            }

            if(text_radio.equals("2")){
                createToast(text_isim,R.drawable.logo1)
            }

            if(text_radio.equals("3")){
                createToast(text_isim,R.drawable.logo2)
            }

            if(text_radio.equals("4")){
                createToast(text_isim,R.drawable.logo3)
            }

        }

        btn.setOnClickListener {
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


    }

    fun createToast(message: String, imgSRC: Int) {

        val layout = layoutInflater.inflate(R.layout.activitiy_custom_toast, null,false)
        val msg = layout.findViewById<TextView>(R.id.custom_toast_message);
        msg.setText(message);
        val img = layout.findViewById<ImageView>(R.id.custom_toast_image);
        img.setImageResource(imgSRC);
        val myToast = Toast(applicationContext)
        myToast.duration = Toast.LENGTH_LONG
        myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        myToast.view = layout
        myToast.show()

    }

}