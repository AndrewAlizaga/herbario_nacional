package com.example.herbario_nacional.data.network.`interface`

import com.example.herbario_nacional.models.Me
import retrofit2.http.GET

interface MeInterface {
    @GET("api/menu/")
    suspend fun requestMe(): Me
}