package com.smirk.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mentee.util.others.AppController
import com.smirk.R
import com.smirk.ui.ProfileActivity1
import kotlinx.android.synthetic.main.activity_sign_up5.*

class SignUpActivity5:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_sign_up5)
        initUI()

    }

    private fun initUI() {

        btnDone.setOnClickListener {
            startActivity(Intent(this, ProfileActivity1::class.java))
            finish()
        }

        tvBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,SignUpActivity4::class.java))
        finish()
    }
}