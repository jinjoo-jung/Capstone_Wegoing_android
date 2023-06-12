package com.example.wegoing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wegoing.databinding.ActivityQuestion1Binding
import com.example.wegoing.databinding.ActivityQuestion6Binding

class Question6Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion6Binding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestion6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, Question7Activity::class.java )
        binding.next6.setOnClickListener{
            startActivity(intent)
        }

        val myDataset = listOf(
            Question("숙박 시설의 가격과 품질을 중점적으로 고려하는 것"),
            Question("대중교통이 발달되어 있어 이동이 편리한 것"),
            Question("유명한 명소나 특별한 이벤트가 있는 곳을 선택하는 것"),
            Question("현지의 문화와 역사를 체험하며 지식과 경험을 쌓는 것")
        )
        // ... 추가적인 질문 데이터

        val layoutManager = LinearLayoutManager(this)
        binding.quesitonRv.layoutManager = layoutManager

        val adapter = QuestionAdapter(myDataset)
        binding.quesitonRv.adapter = adapter
    }
}

