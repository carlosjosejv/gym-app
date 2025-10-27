package com.sena.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sena.login.ui.theme.LoginTheme

@Composable
fun Prueba1(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Button(onClick = {
            navController.navigate(route = "pantalla_2")
        }) {
            Text(text = "Ir a la pantalla 2")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Prueba1Preview() {
    LoginTheme {
        Prueba1(navController = rememberNavController())
    }
}