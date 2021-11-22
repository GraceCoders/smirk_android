package com.smirk.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mentee.util.others.AppController
import com.smirk.R
import kotlinx.android.synthetic.main.activity_sign_up4.*

class SignUpActivity4:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_sign_up4)
        initUI()

    }

    private fun initUI() {

        imgNext.setOnClickListener {
            startActivity(Intent(this,SignUpActivity5::class.java))
            finish()
        }

        tvBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,SignUpActivity3::class.java))
        finish()
    }
}