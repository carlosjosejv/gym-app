package com.sena.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sena.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {

    val authViewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {

            val currentUser by authViewModel.currentUser.collectAsState()

            val navController = rememberNavController()


            LoginTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = if (currentUser != null) "home" else "login",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(route = "home") {
                            Home()
                        }

                        composable(route = "login") {
                            PantallaInicial(
                                navController = navController,
                                viewmodel = authViewModel
                            )
                        }
                        composable(route = "sign_in") {
                            InicioDeSesion(
                                navController = navController,
                                viewModel = authViewModel,
                                activity = this@MainActivity
                            )
                        }
                        composable(route = "sign_up") {
                            Registro(
                                navController = navController,
                                viewModel = authViewModel,
                                activity = this@MainActivity
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginTheme {
        Greeting("Android")
    }
}