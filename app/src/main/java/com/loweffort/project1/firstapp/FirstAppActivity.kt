package com.loweffort.project1.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.loweffort.project1.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener {
            val textInput = etName.text.toString()
            if (textInput.isNotEmpty()) {
                Log.i("Pressed", "Botón pulsadito mi bro ${etName.text.toString()}")
            } else {
                Log.i("No pressed", "There's no content on input file")
            }
        }
    }
}