package com.example.superheroapp.repository

import android.adservices.adid.AdId
import com.example.superheroapp.SuperheroDataResponse
import com.example.superheroapp.SuperheroDetailResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    // corrutina
    @GET("/api/10230803096811798/search/{name}")
    suspend fun getSuperHeros(@Path("name") superheroName:String) : Response<SuperheroDataResponse>

    @GET("/api/10230803096811798/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId: String):Response<SuperheroDetailResponse>
}