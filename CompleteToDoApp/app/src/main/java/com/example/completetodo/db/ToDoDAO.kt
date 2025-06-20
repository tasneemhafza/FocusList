package com.example.completetodo.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.completetodo.DataClass

@Dao
interface ToDoDAO {
    @Query("SELECT * FROM DATACLASS")
    fun getAllTodo() : LiveData<List<DataClass>>

    @Insert
    fun addTodo(todo: DataClass)

    @Query("Delete FROM DataClass where id = :id")
    fun deleteTodo(id : Int)
}