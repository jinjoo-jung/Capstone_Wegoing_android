package com.example.wegoing

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.wegoing.databinding.ActivityQuestion1Binding

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding: ActivityQuestion1Binding

    init {
        binding = ActivityQuestion1Binding.inflate(LayoutInflater.from(context), this, true)
    }

//    fun setText(text: String) {
//        binding.textView.text = text
    }
