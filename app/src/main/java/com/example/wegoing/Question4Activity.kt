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
            Question("차나 오토바이로 자유로운 여행을 즐기는 것"),
            Question("공공 교통을 이용해 현지인들과 함께 이동하는 것"),
            Question("비행기로 멀리 떠나는 것"),
            Question("자전거로 체력을 쑥쑥 키우는 것")
        )
        // ... 추가적인 질문 데이터

        val layoutManager = LinearLayoutManager(this)
        binding.quesitonRv.layoutManager = layoutManager

        val adapter = QuestionAdapter(myDataset)
        binding.quesitonRv.adapter = adapter
    }
}

