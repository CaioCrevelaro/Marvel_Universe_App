package com.br.marvel_universe.model


import com.google.gson.annotations.SerializedName

data class Stories(
    @SerializedName("available")
    val available: Int,
    @SerializedName("collectionURI")
    val collectionURI: String,
    @SerializedName("items")
    val items: List<StoriesItem>,
    @SerializedName("returned")
    val returned: Int
)