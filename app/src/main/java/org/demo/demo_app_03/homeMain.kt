package org.demo.demo_app_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.demo.demo_app_03.databinding.ActivityMainBinding

class homeMain : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }
}