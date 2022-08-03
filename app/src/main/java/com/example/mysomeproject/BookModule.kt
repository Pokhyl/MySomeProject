package com.example.mysomeproject

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class BookModule {
    @Provides
    fun createApi(): BookApi{
        return  Retrofit
            .Builder()
            .baseUrl("https://spring-boot-mysql-server-part0.herokuapp.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BookApi::class.java)

    }
    @Provides
    fun createDB(application: Application):MyDao{
        return DataBaseHelper
            .getDatabase(application)
            .getBookItemDao()
    }
}