package com.example.mycalculator

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val tv = TextView(this)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val scrollview=findViewById<ScrollView>(R.id.Scroll)
        val textView = findViewById<TextView>(R.id.textView).apply {
            tv.setText(message);
        }
        scrollview.addView(tv)
        }
    }
