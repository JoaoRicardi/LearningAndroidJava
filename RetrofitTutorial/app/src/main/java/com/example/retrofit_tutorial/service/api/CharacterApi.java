package com.example.retrofit_tutorial.service.api;

import com.example.retrofit_tutorial.model.CharacterResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CharacterApi {

    @GET("characters")
    Observable<CharacterResponse> getCharacters(@Query("api_key") String apiKey,
                                           @Query("format") String format);
                                          /* @Query("sort") String sort,
                                           @Query("limit") int limit,
                                           @Query("offset") int offset);*/



}
