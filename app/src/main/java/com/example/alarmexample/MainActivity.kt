package com.example.alarmexample

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var button: Button;
    lateinit var edtTextHour: TextView;
    lateinit var edtTextMinute: TextView;
    private var calendar: Calendar = Calendar.getInstance();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Use findViewById to declare button and editTexts
        button = findViewById(R.id.button);
        edtTextHour = findViewById(R.id.edtTextHour);
        edtTextMinute = findViewById(R.id.edtTextMinute);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SET_ALARM) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,arrayOf<String>(Manifest.permission.SET_ALARM), 101);
        }


        //TODO: Call setAlarm()
        button.setOnClickListener {
            //TODO:
        }

    }
    fun setAlarm() {
        // TODO: Read value of both text fields

        // CODE HERE

        // TODO: Create a new intent for setting alarms
//        AlarmClock.ACTION_SET_ALARM)
//        AlarmClock.EXTRA_MESSAGE
//        AlarmClock.EXTRA_HOUR
//        AlarmClock.EXTRA_MINUTES
//        AlarmClock.EXTRA_DAYS



        //TODO: Make an ArrayList with the days you want the alarm for (Calendar."DAY")
        val days: ArrayList<Int> = ArrayList()

        // TODO: Pass the extra days to the intent

        // CODE HERE



        //TODO: Start the activity


        // CODE HERE


        //TODO: OPTIONAL- Add a toast message to show the current day

        // CODE HERE

    }
}