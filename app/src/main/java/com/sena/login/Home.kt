package com.sena.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.login.ui.theme.Gray01
import com.sena.login.ui.theme.Green46
import com.sena.login.ui.theme.LoginTheme
import com.sena.login.ui.theme.Purple17
import com.sena.login.ui.theme.Purple99
import com.sena.login.ui.theme.White01

@Composable
fun Home() {
    // fillMaxSize: Indica al componente que debe
    // ocupar el maximo de espacio disponible

    // background (color): Indica el color de fondo
    // que debe tener el componente

    // padding: Indica la margen de espacio que debe dejar
    // el componente

    val username by remember {
        mutableStateOf("Carlos")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Gray01)
    ) {

        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Hola, $username",
                    color = Purple99,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )

                Row {
                    TopHomeIcon(
                        onClick = {},
                        icon = Icons.Default.Search
                    )


                    TopHomeIcon(
                        onClick = {},
                        icon = Icons.Default.Notifications
                    )


                    TopHomeIcon(
                        onClick = {},
                        icon = Icons.Default.Person
                    )

                }
            }

            Text(
                text = "It's Time To Challenge Your Limits",
                color = White01,
                fontSize = 18.sp
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                SectionItem(
                    color = Green46,
                    icon = R.drawable.ic_visibility,
                    label = "Workout"
                )

                VerticalDivider(modifier = Modifier.height(40.dp))

                SectionItem(
                    color = Purple17,
                    icon = R.drawable.ic_visibility,
                    label = "Process Tracking"
                )

                VerticalDivider(modifier = Modifier.height(40.dp))

                SectionItem(
                    color = Purple17,
                    icon = R.drawable.ic_visibility,
                    label = "Nutrition"
                )

                VerticalDivider(modifier = Modifier.height(40.dp))

                SectionItem(
                    color = Purple17,
                    icon = R.drawable.ic_visibility,
                    label = "Community"
                )
            }

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {

                Text(text = "Recommendations",
                    color = Green46,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "See All",
                        color = White01,
                        fontSize = 18.sp)
                    Icon(imageVector = Icons.Default.PlayArrow,
                        contentDescription = null,
                        tint = Green46)
                }



            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    LoginTheme {
        Home()
    }
}