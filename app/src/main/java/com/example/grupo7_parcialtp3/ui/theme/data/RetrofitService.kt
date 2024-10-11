package com.example.grupo7_parcialtp3.ui.theme.data

import retrofit2.Retrofit
import retrofit2.create

interface RetrofitService {

object RetrofitServiceFactory{
    fun makeRetrofitService(): RetrofitService{
        return  Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/products/1")
            .build().create(RetrofitService::class.java)
    }
}


}