package com.smirk.activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mentee.util.others.AppController
import com.smirk.R
import kotlinx.android.synthetic.main.activity_sign_up1.*
import kotlinx.android.synthetic.main.activity_sign_up3.*
import kotlinx.android.synthetic.main.activity_sign_up3.imgNext

class SignUpActivity3:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_sign_up3)
        initUI()

    }

    private fun initUI() {
        rangeSeekBar.setMax(100) // default is 100
        rangeSeekBar.setRangeColor(ContextCompat.getColor(this,R.color.white))
        rangeSeekBar.setTrackColor(ContextCompat.getColor(this,R.color.footer_bg))

        /*rangeSeekBar.setOnRangeSeekBarListener { rangeSeekBar, start, end ->
            tvmin.setText(start)
            tvmax.setText(end)
        }*/

        imgNext.setOnClickListener {
            startActivity(Intent(this,SignUpActivity4::class.java))
            finish()
        }

        tvBack.setOnClickListener {
            onBackPressed()
        }

        tv10.setOnClickListener {
            tv10.background = ContextCompat.getDrawable(this, R.drawable.ic_distance)
            tv50.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)
            tv100.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)
            tvAny.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)

            tv10.setTextColor(ContextCompat.getColor(this,R.color.black_light))
            tv50.setTextColor(ContextCompat.getColor(this,R.color.white))
            tv100.setTextColor(ContextCompat.getColor(this,R.color.white))
            tvAny.setTextColor(ContextCompat.getColor(this,R.color.white))
        }

        tv50.setOnClickListener {
            tv10.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)
            tv50.background = ContextCompat.getDrawable(this, R.drawable.ic_distance)
            tv100.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)
            tvAny.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)

            tv10.setTextColor(ContextCompat.getColor(this,R.color.white))
            tv50.setTextColor(ContextCompat.getColor(this,R.color.black_light))
            tv100.setTextColor(ContextCompat.getColor(this,R.color.white))
            tvAny.setTextColor(ContextCompat.getColor(this,R.color.white))
        }

        tv100.setOnClickListener {
            tv10.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)
            tv50.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)
            tv100.background = ContextCompat.getDrawable(this, R.drawable.ic_distance)
            tvAny.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)

            tv10.setTextColor(ContextCompat.getColor(this,R.color.white))
            tv50.setTextColor(ContextCompat.getColor(this,R.color.white))
            tv100.setTextColor(ContextCompat.getColor(this,R.color.black_light))
            tvAny.setTextColor(ContextCompat.getColor(this,R.color.white))
        }

        tvAny.setOnClickListener {
            tv10.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)
            tv50.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)
            tv100.background = ContextCompat.getDrawable(this, R.drawable.ic_distance_unselected)
            tvAny.background = ContextCompat.getDrawable(this, R.drawable.ic_distance)

            tv10.setTextColor(ContextCompat.getColor(this,R.color.white))
            tv50.setTextColor(ContextCompat.getColor(this,R.color.white))
            tv100.setTextColor(ContextCompat.getColor(this,R.color.white))
            tvAny.setTextColor(ContextCompat.getColor(this,R.color.black_light))
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this,SignUpActivity2::class.java))
        finish()
    }
}