@file:Suppress("DEPRECATION")

package com.example.myapplication03


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class First : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        // used to delay in layout
        Handler().postDelayed({
            //jump one layout to an other layout
            intent = Intent(this,Log::class.java)
            startActivity(intent)
            //end to this jump layout code
        }, 5000)
    }
}