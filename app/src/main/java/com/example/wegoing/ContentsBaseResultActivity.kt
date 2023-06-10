package com.example.wegoing

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wegoing.databinding.ActivityContentsBaseResultBinding
import org.json.JSONArray

class ContentsBaseResultActivity:AppCompatActivity(),ContentsResultView {
    private lateinit var binding: ActivityContentsBaseResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContentsBaseResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val data = intent.getStringExtra("EditText")
//        if (data != null) {
//            Log.d("EditText", data)
//        }

        // 콘텐츠기반 여행지 결과 가져오기
        val contentsResultService = ContentsResultService()
        contentsResultService.setContentsResultView(this)
        contentsResultService.getContentsResult()
    }
    override fun onContentsResultSuccess(resp: LikeTravelResponse) {

        // Assume you have received the JSON response in a variable called responseData
        val jsonArray = JSONArray()

        if (jsonArray.length() > 0) {
            val jsonObject = jsonArray.getJSONObject(1) // Assuming you have a single object in the array
            val travelPastName = jsonObject.getString("travelPastName")

            // Set the extracted value to your TextView
            binding.contentsTv.text = travelPastName
        }

//        Log.d("travelPast", resp.toString())
//        binding.contentsTv.text = resp.toString()
    }

    override fun onContentsResultFailure() {

    }
}





//        // 2단계
//        val likeTravelService = LikeTravelService()
//        likeTravelService.setLikeTravelView(this)
//        data?.let { LikeTravel(it) }?.let { likeTravelService.likeTravel(it) }
//    }
//
//        override fun onLikeTravelSuccess(resp: LikeTravelResponse) {
//        Log.d("resp", resp.toString())
//        Toast.makeText(this, "여행지 결과 출력에 성공하였습니다. ", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onLikeTravelFailure() {
//        Toast.makeText(this, "여행지 결과 출력에 실패하였습니다. ", Toast.LENGTH_SHORT).show()
//    }
//
//}
