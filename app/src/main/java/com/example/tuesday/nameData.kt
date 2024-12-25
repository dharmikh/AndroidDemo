package com.example.tuesday

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class nameData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_data)

        // Retrieve the name passed via Intent
        val name = intent.getStringExtra("name")

        // Find the TextView by its ID and set the retrieved name
        val personNameTextView = findViewById<TextView>(R.id.personName)
        personNameTextView.text = "Hello $name!"
    }
}
