package com.smirk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mentee.util.others.AppController
import com.smirk.activity.SignUpActivity1
import com.smirk.other.CommonMethods
import kotlinx.android.synthetic.main.activity_otpactivity.*

class OTPActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_otpactivity)
        init()
        initUI()

    }

    private fun init(){
        pinview1.requestPinEntryFocus()
        //   pinview1.value = otp
        pinview1.showCursor(true)
        pinview1.setCursorColor(ContextCompat.getColor(this,R.color.black))
        pinview1.setTextColor(ContextCompat.getColor(this,R.color.black))
    }

    private fun initUI(){
        btnSubmit.setOnClickListener {
            val length=pinview1.value.length
            if (length==0){
                CommonMethods.showLongToast("Please enter OTP!")
            }else if(length<=5){
                CommonMethods.showLongToast("Please enter valid OTP!")
            }else{
                startActivity(Intent(this, SignUpActivity1::class.java))
                finish()
            }

        }
    }
}