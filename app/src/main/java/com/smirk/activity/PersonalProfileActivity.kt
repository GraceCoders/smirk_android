package com.smirk.activity

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import androidx.core.content.ContextCompat
import com.smirk.R
import kotlinx.android.synthetic.main.activity_personal_profile.*
import kotlinx.android.synthetic.main.activity_personal_profile.etDOB
import kotlinx.android.synthetic.main.activity_setup_profile2.*
import java.text.SimpleDateFormat
import java.util.*

class PersonalProfileActivity : AppCompatActivity() {
    var cal = Calendar.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_profile)
        initUI()
    }

    private fun initUI(){
        imgBack.setOnClickListener {
            onBackPressed()
        }

        btnSave.setOnClickListener {
            onBackPressed()
        }
        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int,
                                   dayOfMonth: Int) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                updateDateInView()
            }
        }

        etDOB.setOnClickListener {
            val datePicker= DatePickerDialog(this,
                dateSetListener,
                // set DatePickerDialog to point to today's date when it loads up
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),

                cal.get(Calendar.DAY_OF_MONTH))
            datePicker.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);

            datePicker.show()
            datePicker.getButton(DatePickerDialog.BUTTON_NEGATIVE).setTextColor(ContextCompat.getColor(this,R.color.purple_700))
            datePicker.getButton(DatePickerDialog.BUTTON_POSITIVE).setTextColor(ContextCompat.getColor(this,R.color.purple_700))

        }


    }

    private fun updateDateInView() {

        val monthName = SimpleDateFormat("MMM").format(cal.getTime())


        val dayName = SimpleDateFormat("EEE").format(cal.getTime())
        val dayNum = SimpleDateFormat("dd").format(cal.getTime())
        val yearNum = SimpleDateFormat("yyyy").format(cal.getTime())

        etDOB.setText(dayName + ", " + dayNum + " " + monthName + " " + yearNum)
    }


    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}