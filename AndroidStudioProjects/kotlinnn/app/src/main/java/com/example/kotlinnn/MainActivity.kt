package com.example.kotlinnn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(
            {
               val c: Int= editText.text.toString().toInt() + editText2.text.toString().toInt()
                textView.text= c.toString()
            }
        )
    }
}
