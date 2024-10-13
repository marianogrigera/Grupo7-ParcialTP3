package com.example.grupo7_parcialtp3.ui.theme.data

import com.example.grupo7_parcialtp3.ui.theme.data.model.Carts
import com.example.grupo7_parcialtp3.ui.theme.data.model.LoginRequest
import com.example.grupo7_parcialtp3.ui.theme.data.model.LoginResponse
import com.example.grupo7_parcialtp3.ui.theme.data.model.Product
import com.example.grupo7_parcialtp3.ui.theme.data.model.Products
import com.example.grupo7_parcialtp3.ui.theme.data.model.Users
import com.google.android.gms.common.api.Response
import com.google.firebase.firestore.auth.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface RetrofitService {

object RetrofitServiceFactory{
    fun makeRetrofitService(): RetrofitService{
        return  Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitService::class.java)
    }
}

    //Servicio para usuarios
    @GET("products")
    suspend fun getAllProducts(): List<Products>

    @GET("products/{id}")
    suspend fun getOneProduct(@Path("id") id: Int, @Body product: Product): Product

    /*@POST("products")
    suspend fun createProduct(@Body product: Product): Product

    @PUT("products/{id}")
    suspend fun updateProduct(@Path("id") id: Int, @Body product: Product): Product

    @PATCH("products/{id}")
    suspend fun patchProduct(@Path("id") id: Int, @Body product: Product): Product

    //@DELETE("products/{id}")
    //suspend fun deleteProduct(@Path("id") id: Int): Response<Unit>*/

    // Servicios para Carts (Carritos)
    @GET("carts")
    suspend fun getAllCarts(): List<Carts>

    @GET("carts/{id}")
    suspend fun getOneCart(@Path("id") id: Int): Carts

    @POST("carts")
    suspend fun createCart(@Body cart: Carts): Carts

    @PUT("carts/{id}")
    suspend fun updateCart(@Path("id") id: Int, @Body cart: Carts): Carts

    //service de eliminar producto de carrito

    //@DELETE("carts/{id}")
    //suspend fun deleteCart(@Path("id") id: Int): Response<Unit>

    //servicio login:
    //@POST("auth/login")
    //suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>

    // Servicios para Users (Usuarios)
    /*
    @GET("users")
    suspend fun getAllUsers(): List<Users>

    @GET("users/{id}")
    suspend fun getOneUser(@Path("id") id: Int): User

    @POST("users")
    suspend fun createUser(@Body user: User): User

    @PUT("users/{id}")
    suspend fun updateUser(@Path("id") id: Int, @Body user: User): User

    @DELETE("users/{id}")
    suspend fun deleteUser(@Path("id") id: Int): Response<Unit>
     */
}