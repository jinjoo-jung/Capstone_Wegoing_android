package com.example.wegoing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wegoing.databinding.ActivityCollaborationFillteringBinding

class CollaborationFillteringActivity:AppCompatActivity() {
    private lateinit var binding: ActivityCollaborationFillteringBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCollaborationFillteringBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, ContentsBasedActivity::class.java )
        binding.collaboraionClick.setOnClickListener{
            startActivity(intent)
        }
    }
}