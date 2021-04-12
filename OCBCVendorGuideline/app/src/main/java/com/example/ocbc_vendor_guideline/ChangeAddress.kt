package com.example.ocbc_vendor_guideline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChangeAddress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_address)

        val actionbar = supportActionBar
        actionbar!!.title = "Change Address"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}