package com.smirk.other


import android.app.ProgressDialog

import android.graphics.*

import android.view.View

import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.mentee.util.others.AppController
import java.io.*

import java.util.*



class CommonMethods {
    companion object {
        private var mProgress: ProgressDialog? = null

        fun showSnackBar(mParentview: View, message: String) {
            val snackbar = Snackbar.make(mParentview, message, Snackbar.LENGTH_LONG)
            snackbar.show()
        }

        fun showShortToast(message: String?) {
            Toast.makeText(AppController.mInstance, message, Toast.LENGTH_SHORT).show()
        }

        fun showLongToast(message: String) {
            Toast.makeText(AppController.mInstance, message, Toast.LENGTH_LONG).show()
        }



    }


}