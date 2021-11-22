package com.smirk.ui

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mentee.util.others.AppController
import com.smirk.R
import kotlinx.android.synthetic.main.activity_setup_profile2.*
import java.text.SimpleDateFormat
import java.util.*


class ProfileActivity2:AppCompatActivity() {
    var cal = Calendar.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.mInstance.setStatusBarGradiant(this)
        setContentView(R.layout.activity_setup_profile2)
        initUI()

    }

    private fun initUI() {

        tvMale.setOnClickListener {
            tvMale.background = ContextCompat.getDrawable(this, R.drawable.ic_sex_bg)
            tvMale.setTextColor(ContextCompat.getColor(this,R.color.black_light))

            tvFemale.background = ContextCompat.getDrawable(this, R.drawable.ic_sex_unslected)
            tvFemale.setTextColor(ContextCompat.getColor(this,R.color.white))

            tvNon.background = ContextCompat.getDrawable(this, R.drawable.ic_sex_unslected)
            tvNon.setTextColor(ContextCompat.getColor(this,R.color.white))

        }

        tvFemale.setOnClickListener {
            tvMale.background = ContextCompat.getDrawable(this, R.drawable.ic_sex_unslected)
            tvMale.setTextColor(ContextCompat.getColor(this,R.color.white))

            tvFemale.background = ContextCompat.getDrawable(this, R.drawable.ic_sex_bg)
            tvFemale.setTextColor(ContextCompat.getColor(this,R.color.black_light))

            tvNon.background = ContextCompat.getDrawable(this, R.drawable.ic_sex_unslected)
            tvNon.setTextColor(ContextCompat.getColor(this,R.color.white))

        }

        tvNon.setOnClickListener {
            tvMale.background = ContextCompat.getDrawable(this, R.drawable.ic_sex_unslected)
            tvMale.setTextColor(ContextCompat.getColor(this,R.color.white))

            tvFemale.background = ContextCompat.getDrawable(this, R.drawable.ic_sex_unslected)
            tvFemale.setTextColor(ContextCompat.getColor(this,R.color.white))

            tvNon.background = ContextCompat.getDrawable(this, R.drawable.ic_sex_bg)
            tvNon.setTextColor(ContextCompat.getColor(this,R.color.black_light))

        }


        btnNext.setOnClickListener {
            startActivity(Intent(this,ProfileActivity3::class.java))
            finish()
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