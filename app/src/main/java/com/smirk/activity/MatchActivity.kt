package com.smirk.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.smirk.R
import kotlinx.android.synthetic.main.activity_match.*

class MatchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match)
        initUI()
    }

    private fun initUI() {
        btnMsg.setOnClickListener {
            startActivity(Intent(this,ChatActivity::class.java))
        }
    }
}