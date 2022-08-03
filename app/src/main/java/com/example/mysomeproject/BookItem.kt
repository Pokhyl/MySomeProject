package com.example.mysomeproject

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BookItem(

    @PrimaryKey
    val id: Int = 0,

    val author: String,
    val description: String,
    val published: Int,
    val title: String
)
