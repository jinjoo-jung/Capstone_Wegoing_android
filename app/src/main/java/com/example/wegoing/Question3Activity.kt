package com.example.wegoing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wegoing.databinding.ActivityQuestion1Binding
import com.example.wegoing.databinding.ActivityQuestion3Binding

class Question3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion3Binding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestion3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, Question4Activity::class.java )
        binding.next3.setOnClickListener{
            startActivity(intent)
        }
        val myDataset = listOf(
            Question("현지 먹거리와 음식 문화를 체험하는 것"),
            Question("미리 알고 있는 음식을 먹는 것"),
            Question("특별한 식사 경험 (미술관 내 레스토랑, 뷔페 등)"),
            Question("빠른 식사 (패스트푸드, 패스트캐주얼 등)")
        )
        // ... 추가적인 질문 데이터

        val layoutManager = LinearLayoutManager(this)
        binding.quesitonRv.layoutManager = layoutManager

        val adapter = QuestionAdapter(myDataset)
        binding.quesitonRv.adapter = adapter
    }
}

