package com.task.composebottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.task.composebottomnavigation.navigation.BottomNavigationComponent
import com.task.composebottomnavigation.navigation.BottomNavigationGraph
import com.task.composebottomnavigation.ui.theme.ComposeBottomNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBottomNavigationTheme {
                val navController = rememberNavController()

                Scaffold(
                    bottomBar = { BottomNavigationComponent(navHostController = navController) }
                ) {
                    BottomNavigationGraph(navController = navController)
                }
            }
        }
    }
}