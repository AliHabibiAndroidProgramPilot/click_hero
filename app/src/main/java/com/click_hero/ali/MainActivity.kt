package com.click_hero.ali

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.click_hero.ali.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        core()
    }
    private var counter: Int = 0
    private fun core() {
        binding.btnClick.setOnClickListener {
            counter++
            binding.progressHorizontal.progress = counter
            binding.txtNumberCounter.text = counter.toString()
        }
    }

}