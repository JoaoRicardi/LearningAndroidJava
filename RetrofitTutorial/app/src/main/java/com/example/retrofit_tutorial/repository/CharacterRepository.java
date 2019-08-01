package com.example.retrofit_tutorial.repository;

import com.example.retrofit_tutorial.model.Character;
import com.example.retrofit_tutorial.service.RetrofitService;

import java.util.List;

import io.reactivex.Observable;

public class CharacterRepository {


    private RetrofitService retrofitService = new RetrofitService();

    //TODO preencher os campos que voce colocou na api
    private static final String API_KEY = "12be2478910f2da5b64b589a0db163d7e4236305";
    private static final String FORMAT = "json";


    public Observable<List<Character>> getCharactersList(){
        return retrofitService.getCharactersApi()
                .getCharacters(API_KEY,FORMAT)
                .map(characterResponse -> characterResponse.getResults());
        //TODO AO FAZER UMA FUNCAO LAMBDA VAI DAR ERRO!!
        //TODO MUDAR O NIVEL DA LINGUAGEM DE 7 PRA 8
    }


}
