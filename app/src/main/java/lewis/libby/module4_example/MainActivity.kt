package lewis.libby.module4_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface

import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview

import lewis.libby.module4_example.screens.TestScreen
import lewis.libby.module4_example.ui.theme.Module3_ExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Module3_ExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                    TestScreen {
                        finish() // handle "onExit"
                    }
                }
            }
        }
    }
}