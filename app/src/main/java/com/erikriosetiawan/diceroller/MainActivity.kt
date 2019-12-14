package com.erikriosetiawan.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var diceImageFirst: ImageView
    private lateinit var diceImageSecond: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImageFirst = findViewById(R.id.dice_image_first)
        diceImageSecond = findViewById(R.id.dice_image_second)
    }

    /**
     * Click listener for the Roll button
     */
    private fun rollDice() {
        diceImageFirst.setImageResource(getRandomDiceImage())
        diceImageSecond.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage(): Int {
        val randomInt = Random.nextInt(6) + 1
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}