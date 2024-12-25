package com.example.tuesday

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up window insets to handle edge-to-edge layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun submitPersonData(view: View) {
        // Retrieve the name input from the EditText
        val nameInput = findViewById<EditText>(R.id.dataInput)
        val name = nameInput.text.toString() // Get the text from the input field

        if (name.isNotEmpty()) {
            // Create an Intent to navigate to nameData activity and pass the name
            val intent = Intent(this, nameData::class.java) // Corrected the class name to follow conventions
            intent.putExtra("name", name) // Pass the name as a String
            startActivity(intent)

            // Show a Toast message confirming the input
            Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()
        } else {
            // Show a Toast message if the name field is empty
            Toast.makeText(this, "Please enter a name", Toast.LENGTH_SHORT).show()
        }
    }
}
