package com.smirk.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.smirk.R
import com.smirk.adapter.MyAdapter
import com.smirk.adapter.MyAdapterThumb
import kotlinx.android.synthetic.main.activity_otherprofile.*

class CompatibleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compatible)
        initUI()
    }

    private fun initUI(){
        val adapter = MyAdapterThumb(this, supportFragmentManager, 3)
        viewPager!!.adapter = adapter
        tabLayout.setupWithViewPager(viewPager, true)
    }
}