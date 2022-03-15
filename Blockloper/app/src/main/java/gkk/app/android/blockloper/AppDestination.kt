package gkk.app.android.blockloper

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

class AppDestination(navController: NavHostController) {

    val navToHome: () -> Unit = {
        navController.navigate(HOME) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

    val navToBlockCounter: () -> Unit = {
        navController.navigate(BLOCK_COUNTER) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

    val navToWalletExplorer: () -> Unit = {
        navController.navigate(WALLET_EXPLORER) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }


    companion object {
        const val HOME = "HOME"
        const val BLOCK_COUNTER = "BLOCK_COUNTER"
        const val WALLET_EXPLORER = "WALLET_EXPLORER"
    }

}