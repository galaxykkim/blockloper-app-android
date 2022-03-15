package gkk.app.android.blockloper.ui.blockcounter

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import gkk.app.android.blockloper.ui.theme.BlockloperTheme


@Composable
fun BlockCounterScreen(
    blockCounterViewModel: BlockCounterViewModel
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val goalBlockNumber = remember { mutableStateOf("") }
        val nodeUrl = remember { mutableStateOf("") }
        val rowModifier = Modifier.fillMaxWidth()

        // Node URL 입력 영역
        NodeConnectLayout(nodeUrl = nodeUrl)

        // 목표블록 영역
        Row(
            modifier = rowModifier
        ) {
            Text(text = "목표블록번호")
            TextField(
                value = goalBlockNumber.value,
                onValueChange = {
                    goalBlockNumber.value = it
                })
            Button(onClick = {

            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Blue,
                contentColor = Color.Black
            )) {
                Text(text = blockCounterViewModel.buttonLabel.value)
            }
        }

        // 현재블록 영역
        Row(
            modifier = rowModifier
        ) {
            Text(text = "현재블록번호")
            Text(text = blockCounterViewModel.currentBlockNumber.value)
            Spacer(Modifier.width(50.dp))
        }

        // 생성예상시간 영역
        Row(
            modifier = rowModifier
        ) {
            Text(text = "생성예상시간")
            Text(text = blockCounterViewModel.createTime.value)
        }

        // 웹 영역 (네이비즘 시계)


    }
}

@Composable
fun NodeConnectLayout(
    nodeUrl: MutableState<String>,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
    ) {
        Text(text = "노드 URL")
        TextField(
            value = nodeUrl.value,
            onValueChange = {
                nodeUrl.value = it
            }
        )
    }
}




@Preview
@Composable
fun PreviewBlockCounterScreen() {
    BlockloperTheme {
        Surface {
            val viewModel = hiltViewModel<BlockCounterViewModel>()
            BlockCounterScreen(blockCounterViewModel = viewModel)
        }
    }
}