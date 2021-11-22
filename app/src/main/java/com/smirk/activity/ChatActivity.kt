package com.smirk.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.smirk.R
import com.smirk.adapter.ChatAdapter
import com.smirk.adapter.MessageAdapter
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        init()
        initUI()
    }

    private fun init(){
        rvChat.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false))
        rvChat.setAdapter(ChatAdapter(this))


    }

    private fun initUI(){
        imgProfile.setOnClickListener {
            startActivity(Intent(this,OtherProfileActivity::class.java))
        }
        tvName.setOnClickListener {
            startActivity(Intent(this,OtherProfileActivity::class.java))
        }
    }

}