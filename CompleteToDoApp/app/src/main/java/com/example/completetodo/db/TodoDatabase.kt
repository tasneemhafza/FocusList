package com.example.completetodo.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.completetodo.DataClass

@Database(entities = [DataClass::class], version = 1)
@TypeConverters(Converters::class)
abstract class TodoDatabase : RoomDatabase() {
    companion object{
        const val NAME= "Todo_DB"
    }

    abstract fun getTodoDao() : ToDoDAO
}