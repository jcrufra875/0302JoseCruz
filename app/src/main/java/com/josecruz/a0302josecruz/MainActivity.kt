package com.josecruz.a0302josecruz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.josecruz.a0302josecruz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}