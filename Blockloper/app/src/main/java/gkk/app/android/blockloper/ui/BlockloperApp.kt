package gkk.app.android.blockloper.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.rememberInsetsPaddingValues
import com.google.accompanist.insets.statusBarsPadding
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import gkk.app.android.blockloper.AppDestination
import gkk.app.android.blockloper.AppNavGraph
import gkk.app.android.blockloper.common.util.WindowSize
import kotlinx.coroutines.launch

@Composable
fun BlockloperApp(
    windowSize: WindowSize
) {
    val systemUiController = rememberSystemUiController()
    val darkIcons = MaterialTheme.colors.isLight
    SideEffect {
        systemUiController.setSystemBarsColor(Color.Transparent, darkIcons = darkIcons)
    }
    val navController = rememberNavController()
    val navActions = remember(navController) {
        AppDestination(navController)
    }
    val coroutineScope = androidx.compose.runtime.rememberCoroutineScope()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: AppDestination.HOME

    val isExpandedScreen = windowSize == WindowSize.Expanded
    val sizeAwareDrawerState = rememberSizeAwareDrawerState(isExpandedScreen)

    ModalDrawer(
        drawerContent = {
            AppDrawer(
                currentRoot = currentRoute,
                navToHome = navActions.navToHome,
                navToBlockCounter = navActions.navToBlockCounter,
                navToWalletExplorer = navActions.navToWalletExplorer,
                closeDrawer = {
                    coroutineScope.launch {
                        sizeAwareDrawerState.close()
                    }
                },
                modifier = Modifier
                    .statusBarsPadding()
                    .navigationBarsPadding()
            )
        },
        drawerState = sizeAwareDrawerState,
        gesturesEnabled = !isExpandedScreen
    ) {
        Row(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding(bottom = false)
        ) {
            AppNavGraph(

            )
        }
    }
}


@Composable
fun rememberSizeAwareDrawerState(isExpandedScreen: Boolean): DrawerState {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    return if (!isExpandedScreen) {
        drawerState
    } else {
        DrawerState(DrawerValue.Closed)
    }
}


@Composable
fun rememberContentPaddingForScreen(additionalTop: Dp = 0.dp) =
    rememberInsetsPaddingValues(
        insets = LocalWindowInsets.current.systemBars,
        applyTop = false,
        applyEnd = false,
        applyStart = false,
        additionalTop = additionalTop
    )