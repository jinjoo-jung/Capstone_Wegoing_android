package com.example.wegoing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wegoing.databinding.ActivityResultBinding

class ResultActivity:AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, CollaborationFillteringActivity::class.java )
        binding.resultArrow.setOnClickListener{
            startActivity(intent)
        }


    }
}