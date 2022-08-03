package com.example.mysomeproject

import retrofit2.Response
import retrofit2.http.GET

interface BookApi {
    @GET("books")
   suspend fun getBook(): Response<List<BookItem>>
}