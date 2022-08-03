package com.example.mysomeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var bookApi: BookApi
    @Inject
    lateinit var myDao: MyDao

    override fun onCreate(savedInstanceState: Bundle?) {

        (applicationContext as App).bookComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.IO).launch {
         //   var response = BookApiService.bookApi.getBook()
            var response =bookApi.getBook()
            println(response.body())
            var book:BookItem = response.body()?.get(0)?: BookItem(0,"","",0,"")
            myDao.insert(book)
            println(myDao.getList())
        }
    }
}