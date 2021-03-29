package com.br.marvel_universe.network

import com.br.marvel_universe.model.CharactersResponse
import retrofit2.http.GET

interface EndPoint {

    @GET("characters")
    suspend fun getCharactersResponse(): CharactersResponse

//    @GET("comics")
//    suspend fun getComicsResponse(): ComicsResponse

//    @GET("creators")
//    suspend fun getCreatorsResponse(): CreatorsResponse

//    @GET("events")
//    suspend fun getEventsResponse(): EventsResponse

//    @GET("series")
//    suspend fun getSeriesResponse(): SeriesResponse

//    @GET("stories")
//    suspend fun getStoriesResponse(): StoriesResponse
}