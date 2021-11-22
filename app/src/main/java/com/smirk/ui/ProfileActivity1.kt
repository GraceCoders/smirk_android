package com.smirk.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mentee.util.others.AppController
import com.smirk.R
import com.smirk.activity.SignUpActivity2
import kotlinx.android.synthetic.main.activity_setup_profile1.*

class ProfileActivity1:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_setup_profile1)
        initUI()

    }

    private fun initUI() {

        btnNext.setOnClickListener {
            startActivity(Intent(this, ProfileActivity2::class.java))
            finish()
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}