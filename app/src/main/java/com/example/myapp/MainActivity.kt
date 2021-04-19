package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var timeClicked = 0
        // set on-click listener
        btn_click.setOnClickListener {
            myTextView.text = timeClicked.toString()
            timeClicked = timeClicked + 1
            Toast.makeText(this@MainActivity, "Hii Swati.", Toast.LENGTH_SHORT).show()
        }
    }
}