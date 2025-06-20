package com.example.completetodo


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.Instant
import java.util.Date

class ToDoViewModel : ViewModel() {

    val todoDao = MainApplication.todoDatabase.getTodoDao()

    val todoList : LiveData<List<DataClass>> = todoDao.getAllTodo()


    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title : String){
        viewModelScope.launch (Dispatchers.IO) {
            todoDao.addTodo(DataClass(title = title, createdAt = Date.from(Instant.now())))
        }
    }

    fun deleteTodo(id : Int){
        viewModelScope.launch(Dispatchers.IO){
            todoDao.deleteTodo(id)
        }
    }
}