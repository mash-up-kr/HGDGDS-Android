package base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.runningFold
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

abstract class BaseViewModel<INTENT, STATE, SIDE_EFFECT>(stateInitializer: () -> STATE) :
    ViewModel(), CoroutineExceptionHandlerDelegate by CoroutineExceptionHandlerImpl() {
    private val intentChannel = Channel<INTENT>()

    val state = intentChannel.receiveAsFlow()
        .runningFold(stateInitializer(), ::reduceState)
        .stateIn(viewModelScope, SharingStarted.Eagerly, stateInitializer())

    @Suppress("PropertyName")
    private val _sideEffectChannel = Channel<SIDE_EFFECT>(Channel.BUFFERED)
    val sideEffectFlow = _sideEffectChannel.receiveAsFlow()

    fun submitIntent(intent: INTENT) {
        viewModelScope.launch { intentChannel.send(intent) }
    }

    abstract fun reduceState(
        current: STATE,
        intent: INTENT
    ): STATE

    protected fun sendSideEffect(sideEffect: SIDE_EFFECT) {
        viewModelScope.launch { _sideEffectChannel.send(sideEffect) }
    }
}
