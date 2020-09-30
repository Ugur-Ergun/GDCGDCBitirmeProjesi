package com.data

import com.data.model.CommunityModel
import retrofit2.http.GET

interface GoogleCommunityApi {
    @GET("communities")
    suspend fun getTopHeadlines(): MutableList<CommunityModel>
}