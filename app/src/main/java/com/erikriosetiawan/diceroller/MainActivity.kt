package com.erikriosetiawan.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var resultText: TextView
    private lateinit var countUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        resultText = findViewById(R.id.result_text)
        countUp = findViewById(R.id.count_up_button)
        countUp.setOnClickListener { countUp() }
    }

    /**
     * Click listener for the Roll button
     */
    private fun rollDice() {
//        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show()
        val randomInt = Random.nextInt(6) + 1
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        if (resultText.text.toString().equals("Hello, World!", true))
            resultText.text = "1"
        else {
            var resultInt = resultText.text.toString().toInt()
            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}