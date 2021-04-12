package com.example.ocbc_vendor_guideline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html

class ChangeAddress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_address)

        val actionbar = supportActionBar
//        actionbar!!.title = "Change Address"
        actionbar!!.title = Html.fromHtml("<font color=\"black\">Change Address</font>")
        actionbar.setDisplayHomeAsUpEnabled(true)

        TODO("Change color of arrow for back button to BLACK")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}