package com.br.marvel_universe.model


import com.google.gson.annotations.SerializedName

data class StoriesItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("resourceURI")
    val resourceURI: String,
    @SerializedName("type")
    val type: String
)