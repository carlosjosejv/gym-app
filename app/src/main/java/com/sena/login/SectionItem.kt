package com.sena.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.sena.login.ui.theme.LoginTheme
import com.sena.login.ui.theme.Purple17
import java.nio.file.WatchEvent

@Composable
fun SectionItem(color: Color, icon: Int, label: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.size(width = 70.dp, height = 90.dp)
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = label,
            tint = color,
            modifier = Modifier.size(40.dp)
        )
        Text(
            text = label,
            color = color,
            maxLines = 2,
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            lineHeight = 1.0.em
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SectionItemPreview() {
    LoginTheme {
        SectionItem(
            color = Purple17,
            icon = R.drawable.ic_visibility,
            label = "Process Tracking"
        )
    }
}