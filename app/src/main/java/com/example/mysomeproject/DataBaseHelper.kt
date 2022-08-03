package com.example.mysomeproject

import android.content.Context
import androidx.room.Room

object DataBaseHelper {
    @Volatile
    private var INSTANCE: AppDataBase? = null

    fun getDatabase(context: Context): AppDataBase {
        // if the INSTANCE is not null, then return it,
        // if it is, then create the database
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                AppDataBase::class.java,
                "note_database"
            ).build()
            INSTANCE = instance
            // return instance
            instance
        }
    }
}