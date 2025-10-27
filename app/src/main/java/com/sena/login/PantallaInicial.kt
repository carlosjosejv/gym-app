package com.sena.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sena.login.ui.theme.Black1
import com.sena.login.ui.theme.LoginTheme
import com.sena.login.ui.theme.Orange1

@Composable
fun PantallaInicial(navController: NavController,
                    viewmodel: AuthViewModel) {
    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(R.drawable.fondo),
            contentDescription = "Fondo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "FITNESS",
                color = Color.White,
                fontWeight = FontWeight.Bold, fontSize = 60.sp
            )
            Text(
                text = "GYM",
                color = Color.White,
                fontWeight = FontWeight.Bold, fontSize = 60.sp
            )
            Spacer(modifier = Modifier.height(25.dp))
            Button(
                onClick = {

                }, modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Orange1)
            ) {
                Text(
                    text = "Iniciar Sesión",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            }
            Spacer(modifier = Modifier.height(25.dp))
            OutlinedButton(
                onClick = {

                },
                border = BorderStroke(width = 2.dp, color = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp),
            ) {
                Text(
                    text = "Registro",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 25.sp
                )
            }
            Spacer(modifier = Modifier.height(25.dp))
            Button(
                onClick = {

                }, modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Black1)
            ) {
                Text(
                    text = "Iniciar con Google",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaInicialPreview() {
    LoginTheme {
        PantallaInicial(navController = rememberNavController(),
            viewmodel = viewModel())
    }
}