package com.br.marvel_universe.repository

import com.br.marvel_universe.model.CharactersResponse
import com.br.marvel_universe.network.EndPoint
import com.br.marvel_universe.network.RetrofitInit

class Repository {

    private var url = "https://gateway.marvel.com/v1/public/"

    private var service = EndPoint::class

    private val request = RetrofitInit(url).create(service)
    //Criando a conexão com os endpoints da API

    suspend fun getCharacterRequest(): CharactersResponse = request
        .getCharactersResponse()

}