package org.demo.demo_app_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var title = binding.title.text.toString
    }
}