package com.mentee.util.others

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.preference.PreferenceManager
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleObserver


import com.mentee.util.others.Constants.Companion.DEVICE_TOKEN
import com.mentee.util.others.Constants.Companion.FCM_TOKEN
import com.smirk.R

class AppController : Application(), LifecycleObserver {
    private lateinit var preferences: SharedPreferences
    private lateinit var prefToken: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    private lateinit var editorToken: SharedPreferences.Editor
    private val mPrefToken = "Figi"

    companion object {
        @JvmStatic
        lateinit var mInstance: AppController
    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this
        // MultiDex.install(this)


        initializePreferences()
        initializePreferencesToken()

       // ProcessLifecycleOwner.get().lifecycle.addObserver(this)
    }


    @Synchronized
    fun getInstance(): AppController {
        return mInstance
    }

    fun hasNetwork(): Boolean {
        return mInstance.checkIfHasNetwork()
    }

    // initialize shared preferences
    @SuppressLint("CommitPrefEdits")
    private fun initializePreferences() {
        preferences = getSharedPreferences(getPackageName() + "_preferences", Context.MODE_PRIVATE)
        editor = preferences.edit()
    }

    // initialize shared preferences for token
    @SuppressLint("CommitPrefEdits")
    private fun initializePreferencesToken() {
        prefToken = getSharedPreferences(mPrefToken, Context.MODE_PRIVATE)
        editorToken = prefToken.edit()
    }

    // save string
    fun setString(key: String, value: String) {
        editor.putString(key, value)
        editor.commit()
    }

    // get string
    fun getString(key: String): String {
        return preferences.getString(key, "")!!
    }

    // save string
    fun setInt(key: String, value: Int) {
        editor.putInt(key, value)
        editor.commit()

    }

    // get string
    fun getInt(key: String): Int {
        return preferences.getInt(key, 0)
    }

    //save boolean
    fun setBoolean(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.commit()
    }

    // get Boolean
    fun getBoolean(key: String): Boolean {
        return preferences.getBoolean(key, false)
    }

    //save boolean
    fun setFirstInstall(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.commit()
    }

    // get Boolean
    fun getFirstInstall(key: String): Boolean {
        return preferences.getBoolean(key, false)
    }

    // clear preferences
    fun clearData() {
        preferences.edit().clear().apply()
    }

    fun setDeviceToken(value: String) {
        editorToken.putString(DEVICE_TOKEN, value)
        editorToken.commit()
    }

    // get device token
    fun getDeviceToken(): String {
        return prefToken.getString(DEVICE_TOKEN, "232376")!!
    }

    fun setFcmToken(value: String) {
        editorToken.putString(FCM_TOKEN, value)
        editorToken.commit()
    }

    // get device token
    fun getFcmToken(): String {
        return prefToken.getString(FCM_TOKEN, "232376")!!
    }



    private fun checkIfHasNetwork(): Boolean {
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }

    @Suppress("DEPRECATION")
    fun isInternetAvailable(context: Context): Boolean {
        var result = false
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            cm?.run {
                cm.getNetworkCapabilities(cm.activeNetwork)?.run {
                    result = when {
                        hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                        hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                        hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                        else -> false
                    }
                }
            }
        } else {
            cm?.run {
                cm.activeNetworkInfo?.run {
                    if (type == ConnectivityManager.TYPE_WIFI) {
                        result = true
                    } else if (type == ConnectivityManager.TYPE_MOBILE) {
                        result = true
                    }
                }
            }
        }
        return result
    }

    fun setSelectedLanguage(selectedLanguage: String?) {
        editor.putString("selectedLanguage", selectedLanguage)
        editor.commit()
    }

    fun getSelectedLanguage(): String? {
        return preferences.getString("selectedLanguage", "")
    }

    fun setStatusBarGradiant(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window: Window = activity.window
            val background = ContextCompat.getColor(activity, R.color.purple_700)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.setStatusBarColor(activity.resources.getColor(android.R.color.transparent))
            window.setNavigationBarColor(activity.resources.getColor(android.R.color.transparent))
            window.statusBarColor=background
        }
    }



}