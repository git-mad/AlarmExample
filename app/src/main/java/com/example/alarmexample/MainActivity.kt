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
        button = findViewById(R.id.button);
        edtTextHour = findViewById(R.id.edtTextHour);
        edtTextMinute = findViewById(R.id.edtTextMinute);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SET_ALARM) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,arrayOf<String>(Manifest.permission.SET_ALARM), 101);
        }
        button.setOnClickListener {
            setAlarm()
        }

    }
    fun setAlarm() {
        val hours = Integer.valueOf(edtTextHour.text.toString())
        val minutes = Integer.valueOf(edtTextMinute.text.toString())
        //Did not check for not int cases ^
        val intent = Intent(AlarmClock.ACTION_SET_ALARM)
        intent.putExtra(AlarmClock.EXTRA_HOUR, hours)
        intent.putExtra(AlarmClock.EXTRA_MINUTES, minutes)
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, "This is a test alarm")
        val days: ArrayList<Int> = ArrayList()
        days.add(Calendar.FRIDAY)
        days.add(Calendar.SUNDAY)
        days.add(Calendar.TUESDAY)
        intent.putExtra(AlarmClock.EXTRA_DAYS, days)
        startActivity(intent);
        val calendar = Calendar.getInstance()
        val date = calendar.time
        val currentTime = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date)
        Toast.makeText(this, "Date: $currentTime", Toast.LENGTH_SHORT).show()

    }
}