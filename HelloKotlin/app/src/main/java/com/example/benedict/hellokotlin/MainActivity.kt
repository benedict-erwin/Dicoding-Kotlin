package com.example.benedict.hellokotlin

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textHello = findViewById<TextView>(R.id.text_hello)
        textHello.text = "Hello Kotlin!"
    }
}
