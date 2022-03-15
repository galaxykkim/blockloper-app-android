package gkk.app.android.blockloper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import gkk.app.android.blockloper.common.util.rememberWindowSizeClass
import gkk.app.android.blockloper.ui.BlockloperApp
import gkk.app.android.blockloper.ui.theme.BlockloperTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlockloperTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val windowSizeClass = rememberWindowSizeClass()
                    BlockloperApp(windowSizeClass)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BlockloperTheme {
        Greeting("Android")
    }
}