package com.example.grupo7_parcialtp3.ui.theme.views.shop.home

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    // Manejar logica de la view si es necesario

    /*
    private val service = RetrofitService.RetrofitServiceFactory.makeRetrofitService()

    //muchos productos
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products

    fun fetchAllProducts() {
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