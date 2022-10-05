package com.example.homework6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework6_3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        logic()
    }

    private fun logic() {
        val med = intent.getStringExtra("key")
        binding.tvText.text = med
    }
}