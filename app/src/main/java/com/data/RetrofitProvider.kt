package com.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.create

object RetrofitProvider {
    val contentType = MediaType.get("application/json")
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://5f6642a143662800168e7538.mockapi.io/multicamp/")
        .addConverterFactory(Json {
            ignoreUnknownKeys = true
            isLenient = true
            allowSpecialFloatingPointValues = true
            encodeDefaults = false
        }.asConverterFactory(contentType))
        .build()

    val googleCommunityApi = retrofit.create<GoogleCommunityApi>()
}