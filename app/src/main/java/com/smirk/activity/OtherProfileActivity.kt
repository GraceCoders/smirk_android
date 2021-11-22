package com.smirk.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.smirk.R
import com.smirk.adapter.MyAdapter
import kotlinx.android.synthetic.main.activity_otherprofile.*

class OtherProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otherprofile)
        initUI()
    }

    private fun initUI(){

        imgBack.setOnClickListener{
            finish()
        }
        imgOptions.setOnClickListener {
            llOptions.visibility= View.VISIBLE
        }
        imgClose.setOnClickListener {
            llOptions.visibility= View.GONE
        }

        val adapter = MyAdapter(this, supportFragmentManager, 3)
        viewPager!!.adapter = adapter
        tabLayout.setupWithViewPager(viewPager, true)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}