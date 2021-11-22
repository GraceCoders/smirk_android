package com.smirk.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mentee.util.others.AppController
import com.mentee.util.others.Constants
import com.smirk.MainActivity
import com.smirk.R
import kotlinx.android.synthetic.main.activity_setup_profile1.*
import kotlinx.android.synthetic.main.activity_setup_profile1.btnNext
import kotlinx.android.synthetic.main.activity_setup_profile3.*

class ProfileActivity3:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_setup_profile3)
        initUI()

    }

    private fun initUI() {

        imgBack.setOnClickListener {
            onBackPressed()
        }
        btnSave.setOnClickListener {
            llMain.visibility= View.GONE
            rlLocation.visibility= View.VISIBLE
        }

        btnLocation.setOnClickListener {
            AppController.mInstance.setBoolean(Constants.IS_LOGIN,true)
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        tvSkip.setOnClickListener {
            AppController.mInstance.setBoolean(Constants.IS_LOGIN,true)
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,ProfileActivity2::class.java))
        finish()
    }
}