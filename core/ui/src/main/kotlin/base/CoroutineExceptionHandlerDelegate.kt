package base

import kotlinx.coroutines.CoroutineExceptionHandler

interface CoroutineExceptionHandlerDelegate {
    val coroutineExceptionHandler: CoroutineExceptionHandler

    fun combineExceptionHandler(vararg handlers: CoroutineExceptionHandler): CoroutineExceptionHandler
}
