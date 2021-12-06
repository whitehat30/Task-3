package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number1= findViewById<EditText>(R.id.guessNumber).text
        var number2 =findViewById<TextInputLayout>(R.id.guessingNumber).editText?.text
        findViewById<TextView>(R.id.answer).setOnClickListener()
        {
            if (number1.toString().toInt() > number2.toString().toInt()) {
                findViewById<TextView>(R.id.hint).setText("No :) My number is Bigger")
            } else if(number1.toString().toInt() < number2.toString().toInt()) {
                findViewById<TextView>(R.id.hint).setText("No :) My number is Smaller")
            }
            else if(number1.toString().toInt()==number2.toString().toInt())
            {
                findViewById<TextView>(R.id.hint).setText("You are right")
            }
            else
            {
                findViewById<TextView>(R.id.hint).setText("Enter the Values")
            }
        }
    }
}