package com.example.mysomeproject

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component(modules = [BookModule ::class])
interface BookComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun app(application: Application):Builder
        fun  build(): BookComponent
    }
    fun inject(mainActivity: MainActivity)
}