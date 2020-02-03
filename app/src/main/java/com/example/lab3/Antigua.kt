package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lab3.databinding.ActivityAntiguaBinding
import kotlinx.android.synthetic.main.activity_antigua.*

class Antigua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_antigua)

        val binding: ActivityAntiguaBinding= DataBindingUtil.setContentView(this, R.layout.activity_antigua)
        var myName = MyName()
        myName.title= "Antigua Guatemala"
        myName.phrase = "The colonial city of Central america"
        myName.description = "Antigua Guatemala (Spanish pronunciation: [anˈtiɣwa ɣwateˈmala]), commonly " +
                "referred to as just Antigua or la Antigua, is a city in the central highlands of " +
                "Guatemala known for its preserved Spanish Baroque-influenced architecture as well " +
                "as a number of ruins of colonial churches. It served as the capital of the Kingdom " +
                "of Guatemala. It has been designated a UNESCO World Heritage site.\n" +
                "\n" +
                "Antigua Guatemala serves as the municipal seat for the surrounding municipality of " +
                "the same name. It also serves as the departmental capital of Sacatepéquez Department."
        binding.myName = myName

        bttEnviar1.setOnClickListener {
            Toast.makeText(this, "your comment have been send", Toast.LENGTH_SHORT).show()
            val regreso = Intent(this, MainActivity::class.java)
            startActivity(regreso)
        }
    }
}
