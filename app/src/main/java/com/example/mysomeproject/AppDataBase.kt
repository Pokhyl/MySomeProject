package com.example.mysomeproject

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [BookItem::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun getBookItemDao():MyDao
}