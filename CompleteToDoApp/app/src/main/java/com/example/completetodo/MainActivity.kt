package com.example.completetodo

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import com.example.completetodo.ui.theme.CompleteToDoTheme

class MainActivity : ComponentActivity() {
    private val viewModel: ToDoViewModel by viewModels()
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompleteToDoTheme {
                ToDoListPage(viewModel)
            }
        }
    }
}
