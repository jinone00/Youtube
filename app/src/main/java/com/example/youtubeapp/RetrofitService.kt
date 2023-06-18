package com.example.youtubeapp

import retrofit2.Call
import retrofit2.http.GET

class YoutubeItem(
    val id: Int, val title: String, val content: String, val video: String, val thumbnail: String
)

interface RetrofitService {

    @GET("youtube/list/")
    fun getYoutubeItemList(): Call<ArrayList<YoutubeItem>>

}

