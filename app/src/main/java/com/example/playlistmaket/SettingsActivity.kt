package com.example.playlistmaket

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.playlistmaket.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    private var binding: ActivitySettingsBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        binding!!.container.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}