package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
//starting the main activity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        //find button
        rollButton.setOnClickListener { rollDice() }
    }


    private fun rollDice() {
        //create the new object dice with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //adding image view
        val diceImage: ImageView = findViewById(R.id.imageView)
        //applying the condition
       when(diceRoll){
           1->diceImage.setImageResource(R.drawable.dice_1)
           2->diceImage.setImageResource(R.drawable.dice_2)
           3->diceImage.setImageResource(R.drawable.dice_3)
           4->diceImage.setImageResource(R.drawable.dice_4)
           5->diceImage.setImageResource(R.drawable.dice_5)
           6->diceImage.setImageResource(R.drawable.dice_6)
       }
    }

    class Dice(val numSides: Int) {
        fun roll(): Int {
            //creating the random object
            return (1..numSides).random()
        }
    }
}