package com.example.wegoing

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class LoadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        // 로딩 화면을 표시한 후 다음 액티비티로 화면 전환
        Handler().postDelayed({
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000) // 로딩 화면을 표시하는 시간(여기서는 2초)을 지정
    }
}
