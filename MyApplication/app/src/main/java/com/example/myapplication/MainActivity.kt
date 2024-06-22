package com.example.myapplication

import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    var dialogListener =
        OnTimeSetListener { timePicker, i, i1 ->
            // You can add code here to handle the time set by the user
        }
    var cal = Calendar.getInstance()
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showTimeDialog()
    }

    fun showTimeDialog() {
        TimePickerDialog(
            this@MainActivity, dialogListener,
            cal[Calendar.HOUR_OF_DAY], cal[Calendar.MINUTE], false
        ).show()
    }
}
