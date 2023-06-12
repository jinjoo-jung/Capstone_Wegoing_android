package com.example.wegoing

import android.util.Log
import com.example.retrofitpractice.getRetrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LikeTravelService {
    // 1단계
    private lateinit var likeTravelView: LikeTravelView

    fun setLikeTravelView(likeTravelView: LikeTravelView) {
        this.likeTravelView = likeTravelView
    }

    // 2단계
    fun likeTravel(likeTravel: LikeTravel) {
        val likeTravelService = getRetrofit().create(ContentsRetrofitInterface::class.java)
        likeTravelService.LikeTravel(likeTravel)
            .enqueue(object : Callback<LikeTravelResponse> {
                override fun onResponse(
                    call: Call<LikeTravelResponse>,
                    response: Response<LikeTravelResponse>
                ) {
                    Log.d("LikeTravel/SUCCESS", LikeTravelResponse(response.toString()).toString())

                    if (response.isSuccessful) {
                        val resp: LikeTravelResponse? = response.body()
                        if (resp != null) {
                            likeTravelView.onLikeTravelSuccess(resp)
                        }
                    } else {
                        likeTravelView.onLikeTravelFailure()
                    }
                }

                override fun onFailure(call: Call<LikeTravelResponse>, t: Throwable) {
                    Log.e("LikeTravel/FAILURE", t.message.toString())

                }
            })
    }
}

