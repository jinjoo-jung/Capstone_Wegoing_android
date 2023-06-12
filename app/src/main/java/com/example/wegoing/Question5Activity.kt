package com.example.wegoing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wegoing.databinding.ActivityQuestion1Binding
import com.example.wegoing.databinding.ActivityQuestion5Binding

class Question5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion5Binding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityQuestion5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, Question6Activity::class.java )
        binding.next5.setOnClickListener{
            startActivity(intent)
        }

        val myDataset = listOf(
            Question("봄의 꽃길을 걸으며 청량한 공기를 마시는 것"),
            Question("여름 바다와 해수욕을 즐기고 캠핑을 하는 것"),
            Question("가을의 단풍구경과 포근한 온천을 즐기는 것"),
            Question("겨울의 스키장에서 눈썰매를 타는 것")
        )
        // ... 추가적인 질문 데이터

        val layoutManager = LinearLayoutManager(this)
        binding.quesitonRv.layoutManager = layoutManager

        val adapter = QuestionAdapter(myDataset)
        binding.quesitonRv.adapter = adapter
    }
}

