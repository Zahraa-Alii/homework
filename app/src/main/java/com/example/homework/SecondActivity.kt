package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(constant.extraName)
        binding.textData.text = name
    }
}