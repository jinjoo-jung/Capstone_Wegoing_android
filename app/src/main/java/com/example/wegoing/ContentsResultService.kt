package com.example.wegoing

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import com.example.retrofitpractice.getRetrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Arrays.toString
import java.util.Objects.toString

class ContentsResultService {
    // 1단계
    private lateinit var contentsResultView: ContentsResultView
    fun setContentsResultView(contentsResultView: ContentsResultView) {
        this.contentsResultView = contentsResultView
    }

    // 2단계
    @SuppressLint("SuspiciousIndentation")
    fun getContentsResult() {
        val contentsResultService = getRetrofit().create(ContentsResultRetrofitInterface::class.java)
            contentsResultService.LikeTravelResult().enqueue(object: Callback<LikeTravelResponse> {
                override fun onResponse(
                    call: Call<LikeTravelResponse>,
                    response: Response<LikeTravelResponse>
                ) {
                    Log.d("SIGNUP/SUCCESS", response.toString())
                    if (response.isSuccessful) {
                        val resp: LikeTravelResponse? = response.body()
                        if (resp != null) {
                            contentsResultView.onContentsResultSuccess(resp)
                        }
                    } else {
                        contentsResultView.onContentsResultFailure()
                    }
                }
            override fun onFailure(call: Call<LikeTravelResponse>, t: Throwable) {
                //Log.d("contentsResult/FAILURE", t.message.toString())
                // 요청 실패 시 처리 로직 작성
                // 예: 네트워크 연결 실패, 서버 접속 실패 등
            }
        })
    }
}
//                when(resp.code) {
//                    1000 ->  signUpView.onSignUpSuccess()
//                    else -> signUpView.onSignUpFailure()
//                }
//            }
//
//            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
//                Log.d("SIGNUP/FAILURE", t.message.toString())
//            }
//        })
//    }
//}