package com.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class LinkModel(
    val instagram: String,
    val twitter: String,
    val youtube: String,
    val participation: String
) : Parcelable
