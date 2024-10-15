package com.example.twonumbers2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //find views by their ID
        val number1 = findViewById<EditText>(R.id.editTextNumber)
        val number2 = findViewById<EditText>(R.id.editTextNumber2)
        val calculateButton = findViewById<Button>(R.id.button)
        val resultTextView = findViewById<TextView>(R.id.textView)

        //set onClickListener for button

        calculateButton.setOnClickListener {
            //convert text to int
            val num1 = number1.text.toString().toIntOrNull()
            val num2 = number2.text.toString().toIntOrNull()

            //check if inputs are valid
            if(num1 != null && num2 != null) {
                val sum = num1 + num2

                //display result
                resultTextView.text = "The two numbers add to $sum"
            }
            else
            {
                resultTextView.text = "Please set valid numbers"
                resultTextView.setText("Please set valid numbers")

            }



        }


    }
}