package org.demo.demo_app_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Home : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var phone: EditText
    private lateinit var gender: EditText
    private lateinit var password: EditText
    private lateinit var confirm: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        phone = findViewById(R.id.phone)
        gender = findViewById(R.id.gender)
        password = findViewById(R.id.pass)
        confirm = findViewById(R.id.confirmpassword)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            startActivity( Intent(this@Home, Second::class.java))
            val name = name.text.toString()
            intent.putExtra("name", name)

            val email = email.text.toString()
            intent.putExtra("email", email)

            val phone = phone.text.toString()
            intent.putExtra("phone", phone)

            val gender = gender.text.toString()
            intent.putExtra("gender", gender)

            val pass = password.text.toString()
            intent.putExtra("password", pass)

            val conPass = confirm.text.toString()
            intent.putExtra("confirm", conPass)

            startActivity(intent)
            finish()
        }



    }
}