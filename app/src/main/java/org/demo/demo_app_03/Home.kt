package org.demo.demo_app_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.demo.demo_app_03.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val registerButton = findViewById<Button>(R.id.button)


        registerButton.setOnClickListener {
            startActivity( Intent(this@Home, Second::class.java))
            val userName = binding.name.toString()
            intent.putExtra("name", userName)



            startActivity(intent)
            finish()
        }



    }
}