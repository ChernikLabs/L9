package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonR = findViewById<Button>(R.id.button)

        buttonR.setOnClickListener {
            var Intel = Intent(this,MainActivity2::class.java)
            startActivity(Intel)
        }
    }
}