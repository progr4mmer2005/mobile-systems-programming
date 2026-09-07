package com.example.lemonadetreeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lemonadetreeapp.ui.theme.LemonadeTreeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTreeAppTheme {
                LemonApp()
            }
        }
    }
}

@Composable
fun LemonApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Text(text = "Hello there!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LemonadeTreeAppTheme {
        LemonApp()
    }
}
