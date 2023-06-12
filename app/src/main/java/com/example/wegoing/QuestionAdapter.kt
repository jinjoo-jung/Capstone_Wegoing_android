package com.example.wegoing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.wegoing.databinding.ItemQuestionBinding


data class Question(val question:String)

class QuestionAdapter(private val myDataset: List<Question>) :
    RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>() {

    inner class QuestionViewHolder(val binding: ItemQuestionBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val binding = ItemQuestionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return QuestionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        val currentQuestion = myDataset[position]
        holder.binding.questionText.text = currentQuestion.question
        // 아이템이 선택된 상태인지 확인하여 배경색 설정
        holder.binding.questionText.setOnClickListener {
            // 클릭 시 배경색 변경
            val selectedColor = ContextCompat.getColor(holder.itemView.context, R.color.wegoing)
            val defaultColor = ContextCompat.getColor(holder.itemView.context, R.color.wegoing)
            val isSelected = holder.binding.questionText.background?.constantState == holder.itemView.context.getDrawable(R.drawable.question_background)?.constantState
            holder.binding.questionText.setBackgroundColor(if (isSelected) defaultColor else selectedColor)
        }
    }

    override fun getItemCount() = myDataset.size
}
