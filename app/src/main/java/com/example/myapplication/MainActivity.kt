package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)

        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val radioBtn1 = findViewById<RadioButton>(R.id.radioButton)
        val radioBtn2 = findViewById<RadioButton>(R.id.radioButton2)
        val toggleBtn = findViewById<ToggleButton>(R.id.toggleButton)
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(View.OnClickListener {
            val s = "EditText:${editText.text.toString()}\n" +
                    "CheckBox: ${if (checkBox.isChecked) "ON" else "OFF"}\n" +
                    "ToggleButton: ${if (toggleBtn.isChecked) "ON" else "OFF"}\n" +
                    "RadioGroup: ${if (radioBtn1.isChecked) "RadioButton 1"
                        else if (radioBtn2.isChecked) "RadioButton 2"  else ""}"

            textView?.setText(s)

        })


    }
}