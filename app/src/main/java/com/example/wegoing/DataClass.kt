package com.example.wegoing

import com.google.gson.annotations.SerializedName

//콘텐츠 기반 알고리즘 (좋았던 여행지 입력하기)
data class LikeTravel(
    @SerializedName(value = "travelPastName") var travelPastName: String
)


//콘텐츠 기반 알고리즘 결과 (좋았던 여행지 입력하기)
data class LikeTravelResponse(
    @SerializedName(value = "travelPastName") var travelPastName: String
)
