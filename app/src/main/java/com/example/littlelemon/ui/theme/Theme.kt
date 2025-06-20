package com.example.littlelemon.ui.theme

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple700 = Color(0xFFEE9972)

private val LightColorPalette = lightColors(
    primaryVariant = Purple700,
//    primary = LittleLemonColor.yellow,
//    secondary = LittleLemonColor.pink

)

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun LittleLemonTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
