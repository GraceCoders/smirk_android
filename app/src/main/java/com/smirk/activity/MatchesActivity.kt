package com.smirk.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.smirk.R
import com.smirk.adapter.MatchesAdapter
import com.smirk.adapter.MessageAdapter
import kotlinx.android.synthetic.main.activity_matches.*
import kotlinx.android.synthetic.main.empty_view.*
import kotlinx.android.synthetic.main.fragment_message.*
import kotlinx.android.synthetic.main.fragment_message.rvMsg

class MatchesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matches)
        init()
        initUI()
    }
    private fun init(){
        rvMatches.layoutManager = GridLayoutManager(this, 2)
        rvMatches.setAdapter(MatchesAdapter(this))
        img.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.art))
        tvTitle.setText("No Match Found!")
        tvSubTitle.setText("You have not found any match yet. Don’t worry! You will soon get your perfect match. Keep swiping.")
        clMain.visibility= View.GONE
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