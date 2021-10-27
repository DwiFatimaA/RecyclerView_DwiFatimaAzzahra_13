package com.example.recyclerview_dwifatimaazzahra_13

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NovelSirhayani(
    val imgNovel: Int,
    val titleNovel: String,
    val descNovel: String
) : Parcelable
