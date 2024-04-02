package com.example.todoapp.data

import com.example.todoapp.data.model.Todo
import kotlinx.coroutines.flow.Flow


interface TodoRepository {
    suspend fun getTodosList(): Flow<Result<List<Todo>>>
}