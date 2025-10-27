package com.sena.login

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.sena.login.ui.theme.LoginTheme
import com.sena.login.ui.theme.Purple99

@Composable
fun TopHomeIcon(icon: ImageVector,
                onClick: () -> Unit){
    IconButton(onClick = onClick) {
        Icon(imageVector = icon,
            contentDescription = null,
            tint = Purple99
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopHomeIconPreview(){
    LoginTheme {
        TopHomeIcon(icon = Icons.Default.Notifications,
            onClick = {})
    }
}