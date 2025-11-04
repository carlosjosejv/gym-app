package com.sena.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sena.login.ui.theme.LoginTheme
import com.sena.login.ui.theme.Purple17
import com.sena.login.ui.theme.White01

@Composable
fun BotonPlay(onClick: () -> Unit){
    Box( modifier =
        Modifier.size(50.dp)
            .background(color = Purple17,
                shape = CircleShape)
            .clickable{
                onClick()
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(imageVector = Icons.Rounded.PlayArrow,
            contentDescription = "Play Video",
            tint = White01,
            modifier = Modifier.size(40.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BotonPlayPreview(){
    LoginTheme {
        BotonPlay(onClick = {})
    }
}