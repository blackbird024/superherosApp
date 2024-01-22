package com.example.superheroapp

import com.google.gson.annotations.SerializedName
import retrofit2.Response


// Datos a extraer de la API
data class SuperheroDataResponse(
    @SerializedName("response") val response: String,
    @SerializedName("results") val superheros: List<SuperheroItemResponse>

)

data class SuperheroItemResponse(
    @SerializedName("id") val superheroId: String,
    @SerializedName("name") val superheroName: String,
    @SerializedName("image") val superheroImg: SuperheroImgResponse,

    )

data class SuperheroImgResponse(
    @SerializedName("url") val url: String,
)