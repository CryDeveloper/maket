package com.example.myfirstlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class BuyTickets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_tickets)
        init()
    }

    fun init()
    {
        var fullName = findViewById<EditText>(R.id.editTextFullName)
        var mail = findViewById<EditText>(R.id.editTextMail)
        var btnPay = findViewById<Button>(R.id.btnPay)

        btnPay.setOnClickListener()
        {
            if (fullName.text.isNotEmpty() && mail.text.isNotEmpty())
            {
                Toast.makeText(this,"SUCCESSFUL",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"ENTER THE DATA",Toast.LENGTH_LONG).show()
            }
        }
    }
}