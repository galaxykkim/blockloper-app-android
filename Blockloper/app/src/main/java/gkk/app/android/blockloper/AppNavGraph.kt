package gkk.app.android.blockloper

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import gkk.app.android.blockloper.ui.home.HomeScreen
import gkk.app.android.blockloper.ui.home.HomeViewModel

@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    openDrawer: () -> Unit = {},
    startDestination: String = AppDestination.HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(AppDestination.HOME) {
            val homeViewModel = hiltViewModel<HomeViewModel>()
            HomeScreen(homeViewModel = homeViewModel)
        }

        composable(AppDestination.BLOCK_COUNTER) {

        }

        composable(AppDestination.WALLET_EXPLORER) {

        }
    }
}