package com.click_hero.ali

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.click_hero.ali.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        preferences = getPreferences(MODE_PRIVATE)
        val editor = preferences.edit()
        notifierViews(preferences.getInt("counter", 0))
        binding.btnClick.setOnClickListener {
            editor.putInt("counter", binding.txtNumberCounter.text.toString().toInt() + 1).apply()
            notifierViews(preferences.getInt("counter", 0))
        }
    }

    private fun notifierViews(notif: Int) {
        binding.txtNumberCounter.text = notif.toString()
        binding.progressHorizontal.progress = notif
    }
}