package org.demo.demo_app_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class homemain : AppCompatActivity() {
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
        intent.getStringExtra("username")?.let { name ->
            nameTextView.text = "Name: $name"
        }


        emailTextView = findViewById(R.id.email)
        intent.getStringExtra("email")?.let { email ->
            emailTextView.text = "Email: $email"
        }

        phoneTextView = findViewById(R.id.phone)
        intent.getStringExtra("phone")?.let { phone ->
            phoneTextView.text = "Phone: $phone"
        }

        genderTextView = findViewById(R.id.gender)
        intent.getStringExtra("gender")?.let { gender ->
            genderTextView.text = "Gender: $gender"
        }

        passwordTextView = findViewById(R.id.pass)
        intent.getStringExtra("password")?.let { password ->
            passwordTextView.text = "Password: $password"
        }

        conPassTextView = findViewById(R.id.confirmpassword)
        intent.getStringExtra("confirm")?.let { confirmpassword ->
            conPassTextView.text = "Confirm Password: $confirmpassword"
        }


    }
    }