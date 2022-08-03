package com.example.mysomeproject


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object BookApiService{
    var bookApi:BookApi = Retrofit
        .Builder()
        .baseUrl("https://spring-boot-mysql-server-part0.herokuapp.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(BookApi::class.java)

}