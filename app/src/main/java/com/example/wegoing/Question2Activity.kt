package com.example.wegoing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wegoing.databinding.ActivityQuestion1Binding
import com.example.wegoing.databinding.ActivityQuestion2Binding

class Question2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion2Binding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestion2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, Question3Activity::class.java )
        binding.next2.setOnClickListener{
            startActivity(intent)
        }
        val myDataset = listOf(
            Question("신나는 파티나 축제에 참여하는 것"),
            Question("조용한 휴식과 자연을 즐기는 것"),
            Question("유적지나 역사적 장소를 탐험하는 것"),
            Question("새로운 문화와 인종을 경험하는 것")
        )
        // ... 추가적인 질문 데이터

        val layoutManager = LinearLayoutManager(this)
        binding.quesitonRv.layoutManager = layoutManager

        val adapter = QuestionAdapter(myDataset)
        binding.quesitonRv.adapter = adapter
    }
}

