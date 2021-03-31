package com.example.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Double

class MainActivity : AppCompatActivity() {
    var b1: Button? = null
    var number1: EditText? = null
    var number2: EditText? = null
    var Add_button: Button? = null
    var result: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number1 = findViewById<View>(R.id.editText1) as EditText
        number2 = findViewById<View>(R.id.editText2) as EditText
        Add_button = findViewById<View>(R.id.button) as Button
        result = findViewById<View>(R.id.textView) as TextView
        Add_button!!.setOnClickListener { // num1 or num2 double type
            // get data which is in edittext, convert it to string
            // using parse Double convert it to Double type
            val num1 = number1!!.text.toString().toDouble()
            val num2 = number2!!.text.toString().toDouble()
            // add both number and store it to sum
            val sum = num1 + num2
            //val editText=findViewById<EditText>(R.id.editText)
            // set it ot result textview
            result!!.text = Double.toString(sum)
            val message= result!!.text.toString()
            val intent= Intent(this,DisplayMessage::class.java).apply {
                putExtra(AlarmClock.EXTRA_MESSAGE,message)
            }
            startActivity(intent)
        }
    }

}