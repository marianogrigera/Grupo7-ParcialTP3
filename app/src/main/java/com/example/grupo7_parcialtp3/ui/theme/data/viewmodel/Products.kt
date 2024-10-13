package com.example.grupo7_parcialtp3.ui.theme.data.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.grupo7_parcialtp3.ui.theme.data.RetrofitService
import com.example.grupo7_parcialtp3.ui.theme.data.model.Product
import kotlinx.coroutines.Dispatchers

class Products {

    private val service = RetrofitService.RetrofitServiceFactory.makeRetrofitService()

    //muchos productos
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products

    /*fun fetchAllProducts() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val productList = service.getAllProducts()
                _products.postValue(productList)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    //un producto
    private val _product = MutableLiveData<Product>()
    val product: LiveData<Product> get() = _product

    fun fetchProductById(id: int){
        viewModelScope.launch(Dispatchers.IO){
            try{
                val product= service.getOneProduct(id)
                _product.postValue(product)
            }catch(e: Exception){
                e.printStackTrace()
            }
        }
    }

     */


}