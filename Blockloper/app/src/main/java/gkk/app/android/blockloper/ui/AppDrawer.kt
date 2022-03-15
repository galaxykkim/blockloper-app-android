package gkk.app.android.blockloper.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import gkk.app.android.blockloper.AppDestination
import gkk.app.android.blockloper.ui.common.DrawerButton
import gkk.app.android.blockloper.ui.theme.BlockloperTheme

@Composable
fun AppDrawer(
    modifier: Modifier = Modifier,
    currentRoot: String,
    navToHome: () -> Unit,
    navToBlockCounter: () -> Unit,
    navToWalletExplorer: () -> Unit,
    closeDrawer: () -> Unit
) {
    Column(modifier = modifier.fillMaxWidth()) {
        DrawerButton(
            label = "Home",
            icon = Icons.Filled.Home,
            isSelected = currentRoot == AppDestination.HOME,
            action = {
                navToHome()
                closeDrawer()
            }
        )
        DrawerButton(
            label = "Block Counter",
            icon = Icons.Filled.Home,
            isSelected = currentRoot == AppDestination.BLOCK_COUNTER,
            action = {
                navToBlockCounter()
                closeDrawer()
            }
        )
        DrawerButton(
            label = "Wallet Explorer",
            icon = Icons.Filled.Home,
            isSelected = currentRoot == AppDestination.WALLET_EXPLORER,
            action = {
                navToWalletExplorer()
                closeDrawer()
            }
        )
    }
}


@Preview
@Composable
fun PreviewAppDrawer() {
    BlockloperTheme {
        Surface {
            AppDrawer(
                currentRoot = AppDestination.HOME,
                navToHome = { },
                navToBlockCounter = { },
                navToWalletExplorer = { },
                closeDrawer = { }
            )
        }
    }
}
