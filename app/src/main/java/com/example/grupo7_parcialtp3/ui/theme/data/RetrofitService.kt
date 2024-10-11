package com.example.grupo7_parcialtp3.ui.theme.data

import com.example.grupo7_parcialtp3.ui.theme.data.model.Products
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

interface RetrofitService {

object RetrofitServiceFactory{
    fun makeRetrofitService(): RetrofitService{
        return  Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitService::class.java)
    }
}

    @GET("products")
    suspend fun getAllProducts(): List<Products>



/*
solicitud post para login seguro sea algo asi:
interface ApiService {
    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>
}
 */

}