package com.example.wegoing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wegoing.databinding.ActivityQuestion7Binding
import com.example.wegoing.databinding.ActivityQuestion8Binding
import java.util.logging.Handler

class Question8Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion8Binding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestion8Binding.inflate(layoutInflater)
        setContentView(binding.root)


            val intent = Intent(this, LoadingActivity::class.java)
            binding.next8.setOnClickListener {
                startActivity(intent)
        }

        val myDataset = listOf(
            Question("야외 활동 (트레킹, 등산, 서핑 등)"),
            Question("문화 관광 (박물관, 유적지, 사원, 궁전 등)"),
            Question("쇼핑 및 시장 탐방"),
            Question("공연 및 축제 참가")
        )
        // ... 추가적인 질문 데이터

        val layoutManager = LinearLayoutManager(this)
        binding.quesitonRv.layoutManager = layoutManager

        val adapter = QuestionAdapter(myDataset)
        binding.quesitonRv.adapter = adapter
    }
}
