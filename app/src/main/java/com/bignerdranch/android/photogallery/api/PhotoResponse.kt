package com.bignerdranch.android.photogallery.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class PhotoResponse(
    @Json(name = "photo") val galleryItems: List<GalleryItem>
)