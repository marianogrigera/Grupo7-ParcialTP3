package com.example.grupo7_parcialtp3.ui.theme.data.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.grupo7_parcialtp3.ui.theme.data.RetrofitService
import com.example.grupo7_parcialtp3.ui.theme.data.model.Product

class Products {

    private val service = RetrofitService.RetrofitServiceFactory.makeRetrofitService()

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products
}