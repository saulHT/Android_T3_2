package com.example.practica_t3.service;

import com.example.practica_t3.entidades.Anime;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AnimeService {
    @POST("animes")
    Call<List<Anime>> create(@Body Anime anime);


}
