package com.sena.login

import android.app.Activity
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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
fun Registro(navController: NavController,
             viewModel: AuthViewModel,
             activity: Activity) {

    var name by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var showPassword by remember {
        mutableStateOf(false)
    }

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
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = name,
                onValueChange = {
                    name = it
                },
                label = {
                    Text(text = "Nombre", color = Color.White)
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Black1,
                    unfocusedContainerColor = Black1,
                    focusedBorderColor = Color.DarkGray,
                    unfocusedBorderColor = Color.DarkGray
                ),
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(color = Color.White),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                },
                label = {
                    Text(text = "Correo electrónico", color = Color.White)
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Black1,
                    unfocusedContainerColor = Black1,
                    focusedBorderColor = Color.DarkGray,
                    unfocusedBorderColor = Color.DarkGray
                ),
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(color = Color.White),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )

            Spacer(modifier = Modifier.height(5.dp))

            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = {
                    Text(text = "Contraseña", color = Color.White)
                },
                trailingIcon = {
                    IconButton(onClick = {
                        showPassword = !showPassword
                    }) {
                        Icon(
                            painter = painterResource(if (showPassword) R.drawable.ic_visibility_off else R.drawable.ic_visibility),
                            contentDescription = "Show Password"
                        )
                    }
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Black1,
                    unfocusedContainerColor = Black1,
                    focusedBorderColor = Color.DarkGray,
                    unfocusedBorderColor = Color.DarkGray
                ),
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(color = Color.White),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {
                    viewModel.createAccount(email = email,
                        password =  password, activity = activity)
                }, modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Orange1)
            ) {
                Text(
                    text = "Registrarse",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
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
                    text = "Iniciar Sesión",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 25.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegistroPreview() {
    LoginTheme {
        Registro(navController = rememberNavController(),
            viewModel = viewModel(),
            activity = Activity()
        )
    }
}