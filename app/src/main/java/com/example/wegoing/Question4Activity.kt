package com.example.wegoing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wegoing.databinding.ActivityQuestion1Binding
import com.example.wegoing.databinding.ActivityQuestion4Binding

class Question4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion4Binding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityQuestion4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, Question5Activity::class.java )
        binding.next4.setOnClickListener{
            startActivity(intent)
        }

        val myDataset = listOf(
            Question("자연과 풍경의 아름다움"),
            Question("역사와 문화의 깊이 있는 경험"),
            Question("먹거리와 음식 문화의 다양성"),
            Question("쇼핑과 엔터테인먼트의 풍부함")
        )
        // ... 추가적인 질문 데이터

        val layoutManager = LinearLayoutManager(this)
        binding.quesitonRv.layoutManager = layoutManager

        val adapter = QuestionAdapter(myDataset)
        binding.quesitonRv.adapter = adapter
    }
}

