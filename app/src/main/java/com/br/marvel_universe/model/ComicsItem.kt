package com.br.marvel_universe.model


import com.google.gson.annotations.SerializedName

data class ComicsItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("resourceURI")
    val resourceURI: String
)