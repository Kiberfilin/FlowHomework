package otus.homework.flowcats.state

import otus.homework.flowcats.Fact

sealed class Result {
    data class Success(val fact: Fact): Result()
    data object Loading: Result()
    data class Error(val errorMsg: String): Result()
}