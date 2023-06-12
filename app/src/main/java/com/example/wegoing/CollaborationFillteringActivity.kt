package com.example.wegoing

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wegoing.databinding.ActivityCollaborationFillteringBinding

class CollaborationFillteringActivity:AppCompatActivity() {
    private lateinit var binding: ActivityCollaborationFillteringBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCollaborationFillteringBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val send = binding.collaboraionSend
        send.setOnClickListener {
            Toast.makeText(applicationContext, "여행지 입력이 완료되었습니다", Toast.LENGTH_SHORT).show()
        }


        val intent = Intent(this, ContentsBasedActivity::class.java )
        binding.collaboraionClick.setOnClickListener{
            startActivity(intent)
        }
    }
}