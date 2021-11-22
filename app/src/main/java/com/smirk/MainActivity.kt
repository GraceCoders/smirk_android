package com.smirk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.mentee.util.others.AppController
import com.smirk.fragments.HomeFragment
import com.smirk.fragments.MessageFragment
import com.smirk.fragments.NotificationFragment
import com.smirk.fragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity:AppCompatActivity() {

    var isIndex: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_main)
        init()
        initUI()

    }
    
    private fun init(){
        callHome()
    }

    private fun initUI() {
        llHome.setOnClickListener {
            callHome()
        }

        llChat.setOnClickListener {
            callChat()
        }

        llNoti.setOnClickListener {
            callNoti()
        }

        llSettings.setOnClickListener {
            callSettings()
        }

    }

    private fun callHome() {
        llHome.isEnabled = false
        llChat.isEnabled = true
        llNoti.isEnabled = true
        llSettings.isEnabled = true


        imgHome.setColorFilter(getResources().getColor(R.color.white))
        imgChat.setColorFilter(getResources().getColor(R.color.grey))
        imgNoti.setColorFilter(getResources().getColor(R.color.grey))
        imgSetting.setColorFilter(getResources().getColor(R.color.grey))
        

        replaceFragment(HomeFragment(), "", 0)

    }

    private fun callChat() {
        llHome.isEnabled = true
        llChat.isEnabled = false
        llNoti.isEnabled = true
        llSettings.isEnabled = true
        

        imgHome.setColorFilter(getResources().getColor(R.color.grey))
        imgChat.setColorFilter(getResources().getColor(R.color.white))
        imgNoti.setColorFilter(getResources().getColor(R.color.grey))
        imgSetting.setColorFilter(getResources().getColor(R.color.grey))

        

        replaceFragment(MessageFragment(), "", 1)
    }

    private fun callNoti() {
        llHome.isEnabled = true
        llChat.isEnabled = true
        llNoti.isEnabled = false
        llSettings.isEnabled = true


        imgHome.setColorFilter(getResources().getColor(R.color.grey))
        imgChat.setColorFilter(getResources().getColor(R.color.grey))
        imgNoti.setColorFilter(getResources().getColor(R.color.white))
        imgSetting.setColorFilter(getResources().getColor(R.color.grey))

        replaceFragment(NotificationFragment(), "", 1)

    }

    private fun callSettings() {
        llHome.isEnabled = true
        llChat.isEnabled = true
        llNoti.isEnabled = true
        llSettings.isEnabled = false


        imgHome.setColorFilter(getResources().getColor(R.color.grey))
        imgChat.setColorFilter(getResources().getColor(R.color.grey))
        imgNoti.setColorFilter(getResources().getColor(R.color.grey))
        imgSetting.setColorFilter(getResources().getColor(R.color.white))



        replaceFragment(SettingsFragment(), "", 1)

    }

    fun replaceFragment(fragment1: Fragment, fragment: String, index: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.home_fragment_container, fragment1)
        transaction.addToBackStack(fragment)

        transaction.commit()
        isIndex = index
    }

    override fun onBackPressed() {

        if (isIndex == 1) {
            replaceFragment(HomeFragment.newInstance("", ""), "", 0)

        } else {
            finishAffinity()

        }

    }
}