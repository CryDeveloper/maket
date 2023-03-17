package com.example.myfirstlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    fun init()
    {
        var textView = findViewById<TextView>(R.id.twShowMore)
        var btnBuyTickets = findViewById<Button>(R.id.button)

        textView.setOnClickListener()
        {
            val intent = Intent(this, Timetable::class.java)
            startActivity(intent)
        }
        btnBuyTickets.setOnClickListener()
        {
            startActivity(Intent(this, BuyTickets::class.java))
        }
    }
}