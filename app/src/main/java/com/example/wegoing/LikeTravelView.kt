package com.example.wegoing


// View Interface
// 콘텐츠 기반 입력 데이터
interface LikeTravelView {
    fun onLikeTravelSuccess(travel: LikeTravelResponse?)
    fun onLikeTravelFailure()
}

// 콘텐츠 기반 입력 결과 GET
interface ContentsResultView {
    fun onContentsResultSuccess(resp: LikeTravelResponse)
    fun onContentsResultFailure()
}