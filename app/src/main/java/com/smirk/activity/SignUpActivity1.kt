package com.smirk.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mentee.util.others.AppController
import com.smirk.R
import kotlinx.android.synthetic.main.activity_sign_up1.*

class SignUpActivity1:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_sign_up1)
        init()
        initUI()

    }

    private fun init(){

    }

    private fun initUI() {

        tvFriend.setOnClickListener {
            tvFriend.background = ContextCompat.getDrawable(this, R.drawable.ic_et_bg)
            tvFriend.setTextColor(ContextCompat.getColor(this,R.color.black_light))

            tvRomantic.background = ContextCompat.getDrawable(this, R.drawable.ic_btn_white_bg)
            tvRomantic.setTextColor(ContextCompat.getColor(this,R.color.white))
        }

        tvRomantic.setOnClickListener {
            tvFriend.background = ContextCompat.getDrawable(this, R.drawable.ic_btn_white_bg)
            tvFriend.setTextColor(ContextCompat.getColor(this,R.color.white))

            tvRomantic.background = ContextCompat.getDrawable(this, R.drawable.ic_et_bg)
            tvRomantic.setTextColor(ContextCompat.getColor(this,R.color.black_light))
        }

        imgNext.setOnClickListener {
            startActivity(Intent(this,SignUpActivity2::class.java))
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}