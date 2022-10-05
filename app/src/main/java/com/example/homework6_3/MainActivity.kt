package com.example.homework6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.mainContainer , FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.secondContainer, SecondFragment()).commit()
    }
}