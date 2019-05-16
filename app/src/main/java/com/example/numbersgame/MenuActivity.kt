package com.example.numbersgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {

    private lateinit var playBTN : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        playBTN.setOnClickListener {
            val goToGameScreen : Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(goToGameScreen)
        }
    }
}
