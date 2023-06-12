package com.example.wegoing

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wegoing.databinding.ActivityContentsBaseResultBinding
import com.example.wegoing.databinding.ActivityContentsBasedBinding
import java.util.function.LongFunction

// 1. viewinterface 상속 받기
class ContentsBasedActivity:AppCompatActivity(),LikeTravelView {
    private lateinit var binding: ActivityContentsBasedBinding

//    private fun getLikeTravel(): LikeTravel {
//        val likeTravel = binding.contentsEdittext.text.toString()
//        return LikeTravel(likeTravel)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContentsBasedBinding.inflate(layoutInflater)
        setContentView(binding.root)

//            val likeTravel = binding.contentsEdittext.text.toString()
//            val intent = Intent(this, ContentsBaseResultActivity::class.java)
//            intent.putExtra("EditText", likeTravel)
//            startActivity(intent)




        binding.contentsSend.setOnClickListener {
            Toast.makeText(applicationContext, "여행지가 입력되었습니다", Toast.LENGTH_SHORT).show()

            val data = binding.contentsEdittext.text.toString()

            // LikeTravel 객체 생성
            val likeTravel = LikeTravel(data)
            Log.d("likeTravel" , likeTravel.toString())


            val likeTravelService = LikeTravelService()
            likeTravelService.setLikeTravelView(this)
            likeTravelService.likeTravel(likeTravel)

        }
         binding.contentsResultGo.setOnClickListener{
             val intent =Intent(this, ContentsBaseResultActivity::class.java)
             startActivity(intent)
         }
    }


    override fun onLikeTravelSuccess(travel: LikeTravelResponse?) {
        Log.d("ddddd",travel.toString())

    }

    override fun onLikeTravelFailure() {
        TODO("Not yet implemented")
    }

}

//    }
//}
//            intent.putExtra("EditText", likeTravel)
//           startActivity(intent)
//        }



