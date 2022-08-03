package com.example.mysomeproject

import android.app.Application

class App : Application(){
  lateinit var bookComponent: BookComponent
    override fun onCreate() {
        super.onCreate()
        bookComponent = DaggerBookComponent.builder()
            .app(this)
            .build()
    }
}