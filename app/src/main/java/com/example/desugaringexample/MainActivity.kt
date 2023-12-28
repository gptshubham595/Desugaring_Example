package com.example.desugaringexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desugaringexample.databinding.ActivityMainBinding
import java.time.LocalDate

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = LocalDate.now().toString()
    }
}