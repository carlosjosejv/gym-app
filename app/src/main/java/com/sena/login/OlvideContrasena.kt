package com.sena.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sena.login.ui.theme.LoginTheme

@Composable
fun OlvideContrasena(){
    Text(text = "Olvide Contraseña")
}

@Preview(showBackground = true)
@Composable
fun OlvideContrasenaPreview(){
    LoginTheme {
        OlvideContrasena()
    }
}