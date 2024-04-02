package com.example.todoapp.data


import com.example.todoapp.data.model.Todo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException

class TodoRepositoryImpl(
    private val  api: Api
): TodoRepository {

    override suspend fun getTodosList(): Flow<Result<List<Todo>>> {
        return flow {
            val todosFromApi = try {
                api.getTodosList()
            } catch (e: IOException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading Todos" ))
                return@flow
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            } catch (e: Exception) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            }

        emit(Result.Success(todosFromApi))
        }

    }

}