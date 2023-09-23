package org.demo.demo_app_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.demo.demo_app_03.databinding.ActivityHomeBinding
import org.demo.demo_app_03.databinding.ActivityHomeMainBinding

class Second : AppCompatActivity() {
    private val binding by lazy {
        ActivityHomeMainBinding.inflate(layoutInflater)

        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            val displayTextButton = findViewById<Button>(R.id.button)
            displayTextButton.setOnClickListener {
                // Handle the button click to display the received text
                val receivedText = binding.viewModel?.receivedText ?: "name"
                // You can display the received text in your UI

                val userName = intent.getStringExtra("name")


            }
        }
    }