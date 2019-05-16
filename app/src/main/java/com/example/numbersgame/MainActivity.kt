package com.example.numbersgame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var timePB : ProgressBar
    private lateinit var lookingForTXT : TextView
    private lateinit var answerTXT : TextView
    private lateinit var timesET : EditText
    private lateinit var equationTXT : TextView
    private lateinit var plusET :EditText
    private lateinit var checkBTN : Button

    private var timesNumber : Int = 0
    private var plusNumber : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timePB = findViewById(R.id.timePB)
        lookingForTXT = findViewById(R.id.lookingForTXT);
        answerTXT = findViewById(R.id.answerTXT)
        timesET = findViewById(R.id.timesET)
        equationTXT = findViewById(R.id.equationTXT)
        plusET = findViewById(R.id.plusET)
        checkBTN = findViewById(R.id.checkBTN)

        checkBTN.setOnClickListener{
            var input : String = timesET.text.toString()
            timesNumber = input.toInt()
            input = plusET.text.toString()
            plusNumber = input.toInt()

            var result = timesNumber + plusNumber

            answerTXT.setText(result)
        }

    }
}
