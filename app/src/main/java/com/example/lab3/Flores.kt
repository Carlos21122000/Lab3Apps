package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityFloresBinding
import com.example.lab3.databinding.ActivityTikalBinding
import kotlinx.android.synthetic.main.activity_flores.*

class Flores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flores)

        val binding: ActivityFloresBinding = DataBindingUtil.setContentView(this, R.layout.activity_flores)
        var myName = MyName()
        myName.title= "Flores Island, Peten"
        myName.phrase = "A magical Island at flores"
        myName.description = "Flores is the capital of the Petén Department, Guatemala's landlocked," +
                " northernmost department. The population is 13,700 (2003).\n" +
                "\n" +
                "Flores is the seat of the municipality of Flores (population 22,600).\n" +
                "\n" +
                "Its Catedral Nuestra Señora de Los Remedios y San Pablo Itzá is the cathedral " +
                "episcopal see of the Apostolic Vicariate of El Petén (formerly a territorial" +
                " prelature).\n" +
                "\n" +
                "\n" +
                "Catedral Nuestra Señora de Los Remedios y San Pablo Itzá\n" +
                "The old part of the city is located on an island on Lake Peten Itza, " +
                "connected to the mainland by a short causeway. On the mainland is the suburb" +
                " Santa Elena and, to the West, the contiguous municipality of San Benito."
        binding.myName = myName

        bttEnviar3.setOnClickListener {
            Toast.makeText(this, "your comment have been send", Toast.LENGTH_LONG).show()
            val regreso = Intent(this, MainActivity::class.java)
            startActivity(regreso)
        }
    }
}
