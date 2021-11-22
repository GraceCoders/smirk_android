package com.mentee.util.others

import android.app.PendingIntent.getActivity
import android.text.Html
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import com.google.android.material.snackbar.Snackbar


class Util {
    companion object {

        fun showSnackBar(mParentview: View, message: String) {
            val snackbar = Snackbar.make(
                mParentview,
                HtmlCompat.fromHtml("<font color=\"#C6073D\">" + message + "</font>", HtmlCompat.FROM_HTML_MODE_LEGACY),
                Snackbar.LENGTH_LONG
            )


            snackbar.show()
        }





    }

}