package com.example.me2

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editName = findViewById<EditText>(R.id.editName)
        val textMessage = findViewById<TextView>(R.id.textMessage)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val buttonClear = findViewById<Button>(R.id.buttonClear)

        buttonSubmit.setOnClickListener {
            val name = editName.text.toString()
            textMessage.text = getString(R.string.welcome_message, name)
        }
        buttonClear.setOnClickListener {
            editName.text.clear()
            textMessage.text = ""
        }
    }
}
