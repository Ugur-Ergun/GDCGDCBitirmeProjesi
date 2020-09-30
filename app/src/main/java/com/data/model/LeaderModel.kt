package com.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class LeaderModel(
    val name: String,
    val photo: String
) : Parcelable