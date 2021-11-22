package com.smirk.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.smirk.R
import kotlinx.android.synthetic.main.activity_your_photos.*

class YourPhotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_photos)
        initUI()
    }

    private fun initUI(){
        imgBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}