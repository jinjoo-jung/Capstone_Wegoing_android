package com.example.wegoing

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.example.wegoing.databinding.ActivityQuestion1Binding
import com.example.wegoing.databinding.ActivityTravelTestBinding

class TestActivity :AppCompatActivity() {
    private lateinit var binding: ActivityTravelTestBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityTravelTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.testGo.setOnClickListener {
        val intent = Intent(this,Question1Activity::class.java)
            startActivity(intent)
        }


    }
}