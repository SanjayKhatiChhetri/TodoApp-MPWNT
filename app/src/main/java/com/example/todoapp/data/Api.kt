package com.example.todoapp.data

import com.example.todoapp.data.model.Todos
import retrofit2.http.GET

interface Api {
    @GET("todos")
    suspend fun getTodosList(): Todos

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }
}