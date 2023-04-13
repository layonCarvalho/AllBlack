package com.example.allblack

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        },4000)

        getSupportActionBar()?.hide();
    }
}