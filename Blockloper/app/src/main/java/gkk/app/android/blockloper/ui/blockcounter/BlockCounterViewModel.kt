package gkk.app.android.blockloper.ui.blockcounter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import dagger.hilt.android.lifecycle.HiltViewModel
import gkk.app.android.blockloper.common.BaseViewModel
import gkk.app.android.blockloper.domain.usecase.blockcounter.CalculateBlockCreateTimeUseCase
import gkk.app.android.blockloper.domain.usecase.blockcounter.GetBlockNumberUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlockCounterViewModel @Inject constructor(
    private val getBlockNumberUseCase: GetBlockNumberUseCase,
    private val calculateBlockCreateTimeUseCase: CalculateBlockCreateTimeUseCase,
): BaseViewModel() {

    private var _currentBlockNumber = mutableStateOf("")
    val currentBlockNumber: State<String>
        get() = _currentBlockNumber

    private var _isCounting = mutableStateOf(false)
    val buttonLabel: State<String>
        get() = if (_isCounting.value) mutableStateOf("정지") else mutableStateOf("예측시작")

    private var _createTime = mutableStateOf("")
    val createTime: State<String>
        get() = _createTime


    fun requestBlockNumber(enUrl: String) {
        CoroutineScope(Dispatchers.IO).launch {
            if (_isCounting.value) {
                _isCounting.value = false
                return@launch
            } else {
                _isCounting.value = true
            }
            getBlockNumberUseCase
        }
    }
}