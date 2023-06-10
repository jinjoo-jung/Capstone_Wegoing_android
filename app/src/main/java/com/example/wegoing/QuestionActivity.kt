package com.example.wegoing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import androidx.recyclerview.widget.RecyclerView
import com.example.wegoing.databinding.ActivityQuestion1Binding

class QuestionActivity:AppCompatActivity() {
    private lateinit var binding: ActivityQuestion1Binding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestion1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = listOf(
            Question("당연히 풍경사진도, 내 인생샷도 열심히 찍어야지"),
            Question("주변 사람한테 부탁해서 단체사진부터 찍고싶어"),
            Question("함께 간 사람들의 사진을 찍어줄래"),
            Question("사진을 찍기보다는 그 순간을 내 눈에 담고싶어")
        )
        // ... 추가적인 질문 데이터

        val layoutManager = LinearLayoutManager(this)
        binding.quesitonRv.layoutManager = layoutManager

        val adapter = QuestionAdapter(myDataset)
        binding.quesitonRv.adapter = adapter
    }
}

