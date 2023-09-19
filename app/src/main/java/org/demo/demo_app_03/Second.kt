package org.demo.demo_app_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Second : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var phoneTextView: TextView
    private lateinit var genderTextView: TextView
    private lateinit var passwordTextView: TextView
    private lateinit var conPassTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_main)

        nameTextView = findViewById(R.id.name)
        val userName = intent.getStringExtra("name")
        nameTextView.text = "User Name: "+userName

        emailTextView = findViewById(R.id.email)
        val userEmail = intent.getStringExtra("email")
        nameTextView.text = "User Name: "+userEmail

        phoneTextView = findViewById(R.id.phone)
        val userPhone = intent.getStringExtra("phone")
        phoneTextView.text = "User Name: "+userPhone

        genderTextView = findViewById(R.id.gender)
        val userGender = intent.getStringExtra("gender")
        genderTextView.text = "User Name: "+userGender

        passwordTextView = findViewById(R.id.pass)
        val userPassword = intent.getStringExtra("password")
        passwordTextView.text = "User Name: "+userPassword

        conPassTextView = findViewById(R.id.confirmpassword)
        val userConfirm = intent.getStringExtra("confirm")
        conPassTextView.text = "User Name: "+userConfirm





    }
    }