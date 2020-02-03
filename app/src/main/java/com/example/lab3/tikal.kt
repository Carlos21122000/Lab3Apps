package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityTikalBinding
import kotlinx.android.synthetic.main.activity_tikal.*

class tikal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tikal)
        val binding: ActivityTikalBinding = DataBindingUtil.setContentView(this, R.layout.activity_tikal)
        var myName = MyName()
        myName.title= "Tikal, Peten"
        myName.phrase = "A trip to the heart of the mayan world"
        myName.description = "Tikal (/tiˈkɑːl/) (Tik’al in modern Mayan orthography) is the ruin of an " +
                "ancient city, which was likely to have been called Yax Mutal, found in a rainforest " +
                "in Guatemala.[2] It is one of the largest archaeological sites and urban centers " +
                "of the pre-Columbian Maya civilization. It is located in the archaeological region " +
                "of the Petén Basin in what is now northern Guatemala. Situated in the department of " +
                "El Petén, the site is part of Guatemala's Tikal National Park and in 1979 it was " +
                "declared a UNESCO World Heritage Site."
        binding.myName = myName

        bttEnviar.setOnClickListener {


            val regreso = Intent(this, MainActivity::class.java)
            Toast.makeText(this, "your comment have been send", Toast.LENGTH_LONG).show()
            startActivity(regreso)
        }
    }
}
