package com.example.mysomeproject

import androidx.room.*

@Dao
interface MyDao {
    @Insert
   suspend fun insert(bookItem: BookItem)
    @Delete
  suspend  fun delete(bookItem: BookItem)
    @Update
  suspend  fun update(bookItem: BookItem)
  @Query("SELECT * FROM bookItem")
  suspend fun getList():List<BookItem>

}