package com.data

import com.data.model.GoogleEventModel
import retrofit2.http.GET

interface GoogleEventApi {
    @GET("communities")
    suspend fun getTopHeadlines(): MutableList<GoogleEventModel>
}