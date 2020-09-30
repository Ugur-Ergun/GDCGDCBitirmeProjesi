package com.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class GoogleEventModel(
    val name: String,
    val description: String,
    val banner: String,
    val leader: LeaderModel,
    val links: LinkModel
) : Parcelable
