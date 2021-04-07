package com.example.validationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EndScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_screen)

        val actionbar = supportActionBar

        actionbar!!.title = "Result Page"

        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvFirstName = findViewById<TextView>(R.id.tvFirstNameFill)
        val tvLastName = findViewById<TextView>(R.id.tvLastNameFill)
        val tvEmail = findViewById<TextView>(R.id.tvEmailAddressFill)
        val tvIC = findViewById<TextView>(R.id.tvICFill)
        val tvMobileNumber = findViewById<TextView>(R.id.tvMobileNumberFill)
        val tvFullName = findViewById<TextView>(R.id.tvFullName)

        val firstName = intent.getStringExtra("FirstName")
        val lastName = intent.getStringExtra("LastName")
        val email = intent.getStringExtra("Email")
        val iC = intent.getStringExtra("IC")
        val mobileNumber = intent.getStringExtra("MobileNumber")

        tvFirstName.text = firstName
        tvLastName.text = lastName
        tvEmail.text = email
        tvIC.text = iC
        tvMobileNumber.text = mobileNumber
        tvFullName.text = "$firstName $lastName"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}