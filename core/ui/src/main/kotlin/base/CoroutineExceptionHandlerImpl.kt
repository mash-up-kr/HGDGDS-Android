package base

import kotlinx.coroutines.CoroutineExceptionHandler
import timber.log.Timber

class CoroutineExceptionHandlerImpl : CoroutineExceptionHandlerDelegate {
    companion object {
        private const val COROUTINE_EXCEPTION_HANDLER_DEFAULT_LOG_MESSAGE = "코루틴 익셉션 핸들러에 에러가 수집되었습니다. 확인 부탁드립니다."
    }

    override val coroutineExceptionHandler: CoroutineExceptionHandler =
        CoroutineExceptionHandler { coroutineContext, throwable ->
            Timber.e(throwable, COROUTINE_EXCEPTION_HANDLER_DEFAULT_LOG_MESSAGE)
        }

    override fun combineExceptionHandler(
        vararg handlers: CoroutineExceptionHandler,
    ): CoroutineExceptionHandler {
        return CoroutineExceptionHandler { context, throwable ->
            handlers.forEach { it.handleException(context, throwable) }
        }
    }
}
