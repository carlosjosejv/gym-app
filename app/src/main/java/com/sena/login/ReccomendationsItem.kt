package com.sena.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.login.ui.theme.Gray01
import com.sena.login.ui.theme.Green46
import com.sena.login.ui.theme.LoginTheme
import com.sena.login.ui.theme.Purple99
import com.sena.login.ui.theme.White01

@Composable
fun RecommendationItem(imagen: Int,
                       titulo: String,
                       tiempo: String,
                       calorias: String){

    Box(modifier = Modifier
        .width(250.dp)
        .aspectRatio(ratio = 5f / 4f)
        .clip(shape = RoundedCornerShape(20.dp))
        ){

        Box(modifier = Modifier.matchParentSize()) {
            Box(modifier = Modifier.fillMaxWidth()
                .align(Alignment.BottomCenter)
                .height(62.dp)
                .background(color = Gray01)
                .border(width = 2.dp,
                    color = White01,
                    shape = RoundedCornerShape(bottomStart = 20.dp,
                        bottomEnd = 20.dp))){
                
                Column(modifier = Modifier
                    .matchParentSize()
                    .padding(10.dp)) {

                    Text(text = titulo,
                        color = Green46,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp)

                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween) {
                        Row {
                            Icon(painter =
                                painterResource(R.drawable.ic_schedule),
                                contentDescription = "Time",
                                tint = Purple99
                            )
                            Text(text = tiempo, color = White01)
                        }

                        Row {
                            Icon(painter =
                                painterResource(R.drawable.ic_fire),
                                contentDescription = "Time",
                                tint = Purple99
                            )
                            Text(text = calorias, color = White01)
                        }
                    }
                    
                }

            }

            Image(painter =
                painterResource(imagen),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .fillMaxWidth()
                    .aspectRatio(16f / 9f),
                contentScale = ContentScale.Crop
            )

        }

        BotonPlay(onClick = {

        })
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFC107)
@Composable
fun RecommendationItemPreview(){
    LoginTheme {
        RecommendationItem(
            imagen = R.drawable.imagen04,
            titulo = "Squat Exercise",
            tiempo = "12 Minutos",
            calorias = "120 Kcal"
        )
    }
}