package com.smirk.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.smirk.R
import kotlinx.android.synthetic.main.activity_personal_profile.*
import kotlinx.android.synthetic.main.activity_sign_up3.*

class ProfileSettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_setting)
        initUI()
    }

    private fun initUI(){

        rangeSeekBar.setMax(100) // default is 100
        rangeSeekBar.setRangeColor(ContextCompat.getColor(this,R.color.bg))
        rangeSeekBar.setTrackColor(ContextCompat.getColor(this,R.color.footer_bg))

        imgBack.setOnClickListener {
            onBackPressed()
        }

        btnSave.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}