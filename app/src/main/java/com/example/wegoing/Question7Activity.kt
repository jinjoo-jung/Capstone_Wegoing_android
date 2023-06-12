package com.example.wegoing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wegoing.databinding.ActivityQuestion1Binding
import com.example.wegoing.databinding.ActivityQuestion7Binding

class Question7Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion7Binding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestion7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, Question8Activity::class.java )
        binding.next7.setOnClickListener{
            startActivity(intent)
        }

        val myDataset = listOf(
            Question("호텔이나 리조트와 같은 고급스러운 숙박 시설을 선호하는 것"),
            Question("로컬 펜션과 같은 복잡한 분위기의 숙박 시설을 선호하는 것"),
            Question("에어비앤비와 같은 로컬 렌탈 하우스를 선호하는 것"),
            Question("캠핑이나 카라반 같은 아웃도어 숙박 시설을 선호하는 것")
        )
        // ... 추가적인 질문 데이터

        val layoutManager = LinearLayoutManager(this)
        binding.quesitonRv.layoutManager = layoutManager

        val adapter = QuestionAdapter(myDataset)
        binding.quesitonRv.adapter = adapter
    }
}

