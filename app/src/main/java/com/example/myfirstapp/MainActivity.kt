package com.example.myfirstapp

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "تعداد کلیک: ۰"
            textSize = 24f
            gravity = Gravity.CENTER
        }

        val button = Button(this).apply {
            text = "کلیک کن!"
            textSize = 20f
            setOnClickListener {
                count++
                textView.text = "تعداد کلیک: $count"
            }
        }

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.WHITE)
            addView(textView)
            addView(button)
        }

        setContentView(layout)
    }
}
