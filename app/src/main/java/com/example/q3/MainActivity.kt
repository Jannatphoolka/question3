package com.example.q3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonQ1: Button = findViewById(R.id.buttonQ1)
        val buttonQ2: Button = findViewById(R.id.buttonQ2)

        buttonQ1.setOnClickListener {
            // Replace "com.example.q1" with the actual package name of Q1
            val intentQ1 = Intent().setClassName("com.example.q1", "com.example.q1.MainActivity")
            intentQ1.putExtra("dataKey", "Hello Q1")
            startActivity(intentQ1)
        }

        buttonQ2.setOnClickListener {
            // Replace "com.example.q2" with the actual package name of Q2
            val intentQ2 = Intent().setClassName("com.example.q2", "com.example.q2.MainActivity")
            intentQ2.putExtra("dataKey", "Hello Q2")
            startActivity(intentQ2)
        }
    }
}
