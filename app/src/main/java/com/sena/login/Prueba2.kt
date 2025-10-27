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
fun Prueba2(navController: NavController){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
        Button(onClick = {

        }
        ) {
            Text(text = "Regresar a la pantalla 1")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Prueba2Preview(){
    LoginTheme {
        Prueba2(navController = rememberNavController())
    }
}