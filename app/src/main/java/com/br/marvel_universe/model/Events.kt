package com.br.marvel_universe.model


import com.google.gson.annotations.SerializedName

data class Events(
    @SerializedName("available")
    val available: Int,
    @SerializedName("collectionURI")
    val collectionURI: String,
    @SerializedName("items")
    val items: List<EventsItem>,
    @SerializedName("returned")
    val returned: Int
)