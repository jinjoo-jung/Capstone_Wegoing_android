package com.example.wegoing

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ContentsRetrofitInterface {
    @POST("api/travelPast")
    fun LikeTravel(@Body likeTravel: LikeTravel) : Call<LikeTravelResponse>
}

interface ContentsResultRetrofitInterface{
    @GET("api/travelPast/response")
    fun LikeTravelResult() : Call<LikeTravelResponse>
}

