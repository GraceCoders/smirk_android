package com.smirk.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mentee.util.others.AppController
import com.smirk.R
import kotlinx.android.synthetic.main.activity_sign_up2.*


class SignUpActivity2:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_sign_up2)
        initUI()

    }

    private fun initUI() {
        tvMale.setOnClickListener {
            tvMale.background = ContextCompat.getDrawable(this, R.drawable.ic_et_bg)
            tvMale.setTextColor(ContextCompat.getColor(this,R.color.black_light))

            tvFemale.background = ContextCompat.getDrawable(this, R.drawable.ic_btn_white_bg)
            tvFemale.setTextColor(ContextCompat.getColor(this,R.color.white))

            tvNon.background = ContextCompat.getDrawable(this, R.drawable.ic_btn_white_bg)
            tvNon.setTextColor(ContextCompat.getColor(this,R.color.white))

        }

        tvFemale.setOnClickListener {
            tvMale.background = ContextCompat.getDrawable(this, R.drawable.ic_btn_white_bg)
            tvMale.setTextColor(ContextCompat.getColor(this,R.color.white))

            tvFemale.background = ContextCompat.getDrawable(this, R.drawable.ic_et_bg)
            tvFemale.setTextColor(ContextCompat.getColor(this,R.color.black_light))

            tvNon.background = ContextCompat.getDrawable(this, R.drawable.ic_btn_white_bg)
            tvNon.setTextColor(ContextCompat.getColor(this,R.color.white))

        }

        tvNon.setOnClickListener {
            tvMale.background = ContextCompat.getDrawable(this, R.drawable.ic_btn_white_bg)
            tvMale.setTextColor(ContextCompat.getColor(this,R.color.white))

            tvFemale.background = ContextCompat.getDrawable(this, R.drawable.ic_btn_white_bg)
            tvFemale.setTextColor(ContextCompat.getColor(this,R.color.white))

            tvNon.background = ContextCompat.getDrawable(this, R.drawable.ic_et_bg)
            tvNon.setTextColor(ContextCompat.getColor(this,R.color.black_light))

        }

        imgNext.setOnClickListener {
            startActivity(Intent(this,SignUpActivity3::class.java))
            finish()
        }

        tvBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,SignUpActivity1::class.java))
        finish()
    }
}