package com.example.constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.isVisible
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var tv2: TextView
    private lateinit var tv3: TextView
    private lateinit var tv4: TextView
    private lateinit var tv5: TextView
    private lateinit var tv6: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv2 = findViewById(R.id.tv2)
        tv3 = findViewById(R.id.tv3)
        tv4 = findViewById(R.id.tv4)
        tv5 = findViewById(R.id.tv5)
        tv6 = findViewById(R.id.tv6)

        tv6.setOnClickListener{
            if (tv2.isVisible){
                tv2.isVisible = false
                tv3.isVisible = false
                tv4.isVisible = false
                tv5.isVisible = false

                tv6.text = "Show contact details "
            }
            else {
                tv2.isVisible = true
                tv3.isVisible = true
                tv4.isVisible = true
                tv5.isVisible = true

                tv6.text = "HIDE CONTACT DETAILS"
            }
        }
    }
}