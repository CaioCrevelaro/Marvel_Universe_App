package com.br.marvel_universe.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.br.marvel_universe.model.Result
import com.br.marvel_universe.repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModelCharacters : ViewModel() {

    val mutableListCharacter = MutableLiveData<List<Result>>()
    private val repository = Repository()

    fun getAllCharacters() = CoroutineScope(Dispatchers.IO).launch {
        repository.getCharacterRequest().let { charactersResponse ->
            mutableListCharacter.postValue(charactersResponse.data.results)  }
    }



}