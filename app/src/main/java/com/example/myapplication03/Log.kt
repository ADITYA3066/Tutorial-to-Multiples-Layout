@file:Suppress("DEPRECATION")

package com.example.myapplication03

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Log : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)
         findViewById<TextView>(R.id.t1)
        Handler().postDelayed({
            intent = Intent(this, First::class.java)
            startActivity(intent)
        }, 2000)
    }
}