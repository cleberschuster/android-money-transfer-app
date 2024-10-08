package br.com.schuster.bankdroid.data

sealed class State<T> {
    class Loading<T> : State<T>()
    class Success<T>(val data: T) : State<T>()
    class Error<T>(val error: Exception) : State<T>()
}
