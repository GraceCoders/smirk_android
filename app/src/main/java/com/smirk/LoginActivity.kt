package com.smirk

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.TextUtils
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.mentee.util.others.AppController
import com.smirk.R
import com.smirk.other.CommonMethods
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_login)
        init()
        initUI()

    }

    private fun init(){

    }

    private fun initUI(){
        btnContinue.setOnClickListener {
            val number=etPhoneNumber
            if ( TextUtils.isEmpty(number.toString())){
                CommonMethods.showLongToast("Please enter mobile number!")
            }else if(number!!.length<10 ){
                CommonMethods.showLongToast("Please enter valid mobile number!")
            }else{
                startActivity(Intent(this, OTPActivity::class.java))
                finish()
            }

        }
    }
}