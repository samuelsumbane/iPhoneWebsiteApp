package com.samuelsumbane.iphonewebsiteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samuelsumbane.iphonewebsiteapp.ui.theme.IPhoneWebsiteAppTheme
import androidx.navigation.compose.*
import com.samuelsumbane.iphonewebsiteapp.view.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPhoneWebsiteAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    val state by viewModel.state.collectAsState()
//                    val cstate
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination="home"){
                        composable("home"){
                            Home(navController)
                        }
                    }

                }

            }
        }
    }
}
