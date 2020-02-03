package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bttTikal.setOnClickListener {
           val intento1 = Intent(this, tikal::class.java)
           startActivity(intento1)
        }
        bttAntigua.setOnClickListener {
            val intento2 = Intent(this, Antigua::class.java)
            startActivity(intento2)
        }
        bttFlores.setOnClickListener {
            val intento3 = Intent(this, Flores::class.java)
            startActivity(intento3)
        }

        bttImg.setOnClickListener {
            if(textView2.getVisibility() == View.VISIBLE){
                editText.visibility = View.INVISIBLE
                textView2.visibility = View.INVISIBLE
            }else{
                if(textView2.getVisibility() == View.INVISIBLE) {
                    editText.visibility = View.VISIBLE
                    textView2.visibility = View.VISIBLE
                }
            }
        }
    }
}
