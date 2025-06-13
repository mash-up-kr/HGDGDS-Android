package com.hgdgds.kokkok.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

internal val ColorScheme = KokColorScheme(
    // basic
    white = Color(0xFFFFFFFF),
    black = Color(0xFF0F1015),
    // gray
    gray95 = Color(0xFF212332),
    gray90 = Color(0xFF383947),
    gray80 = Color(0xFF4E4F5B),
    gray70 = Color(0xFF646570),
    gray60 = Color(0xFF7A7B84),
    gray50 = Color(0xFF909199),
    gray40 = Color(0xFFA6A7AD),
    gray30 = Color(0xFFBDBDC2),
    gray20 = Color(0xFFD3D3D6),
    gray15 = Color(0xFFE9E9EB),
    gray10 = Color(0xFFF6F6F7),
    // opacity
    opacityBlack60 = Color(0x990F1015),
    opacityBlack30 = Color(0x4D0F1015),
    opacityWhite30 = Color(0x4DFFFFFF),
    opacityOrange4 = Color(0x0AA88272),
    opacityPink4 = Color(0x0A9C5A90),
    opacityBlue4 = Color(0x0A4F637C),
    opacityPurple4 = Color(0x0A666489),
    opacityGreen4 = Color(0x0A87AD78),
    // orange
    orange700 = Color(0xFFE55218),
    orange500Main = Color(0xFFFE6A30),
    orange400 = Color(0xFFFE8859),
    orange300 = Color(0xFFFEA683),
    orange200 = Color(0xFFFFC3AC),
    orange100Light = Color(0xFFFFEEE6),
    orangeDark = Color(0xFFA88272),
    // pink
    pinkMain = Color(0xFFFC4F92),
    pinkLight = Color(0xFFFFEDF3),
    pinkDark = Color(0xFF9C5A90),
    // blue
    blueMain = Color(0xFF2B8BFF),
    blueLight = Color(0xFFE6F1FD),
    blueDark = Color(0xFF4F637C),
    // purple
    purpleMain = Color(0xFF7C5BFF),
    purpleLight = Color(0xFFECECFF),
    purpleDark = Color(0xFF666589),
    // green
    greenMain = Color(0xFF0FC24D),
    greenLight = Color(0xFFE9F7EE),
    greenDark = Color(0xFF87AD78),
    // red
    redMain = Color(0xFFFF5D5D),
    redLight = Color(0xFFFFEEEE),
    redDark = Color(0xFFDE3333),
    // gradient
    orangeGradientMain = Brush.linearGradient(
        colors = listOf(
            Color(0xFFFF710C),
            Color(0xFFFEB66E),
        ),
    ),
    orangeGradientMain2 = Brush.linearGradient(
        colors = listOf(
            Color(0xFFFF710C),
            Color(0xFFFEB66E),
        ),
    ),
    orangeGradientLight = Brush.linearGradient(
        colorStops = arrayOf(
            0.0f to Color(0xFFFFAE82),
            0.2f to Color(0xFFFFDBCE),
            0.9f to Color(0xFFFFFBF9),
            1.0f to Color(0xFFF6F6F7),
        ),
    ),
    pinkGradientMain = Brush.linearGradient(
        colors = listOf(
            Color(0xFFFC4F92),
            Color(0xFFFF86AE),
        ),
    ),
    pinkGradientLight = Brush.linearGradient(
        colorStops = arrayOf(
            0.0f to Color(0xFFFD9FC3),
            0.2f to Color(0xFFFEDAE8),
            0.9f to Color(0xFFFFFAFC),
            1.0f to Color(0xFFF6F6F7),
        ),
    ),
    blueGradientMain = Brush.linearGradient(
        colors = listOf(
            Color(0xFF2B8BFF),
            Color(0xFF57DFE2),
        ),
    ),
    blueGradientLight = Brush.linearGradient(
        colorStops = arrayOf(
            0.0f to Color(0xFFA3CCFF),
            0.2f to Color(0xFFD6E7FC),
            0.9f to Color(0xFFF4F9FE),
            1.0f to Color(0xFFF6F6F7),
        ),
    ),
    purpleGradientMain = Brush.linearGradient(
        colors = listOf(
            Color(0xFF7C5BFF),
            Color(0xFF89A7F9),
        ),
    ),
    purpleGradientLight = Brush.linearGradient(
        colorStops = arrayOf(
            0.0f to Color(0xFFA69AFF),
            0.2f to Color(0xFFC2C2FF),
            0.9f to Color(0xFFF3F8FE),
            1.0f to Color(0xFFF6F6F7),
        ),
    ),
    greenGradientMain = Brush.linearGradient(
        colors = listOf(
            Color(0xFF0FC24D),
            Color(0xFFC9E86C),
        ),
    ),
    greenGradientLight = Brush.linearGradient(
        colorStops = arrayOf(
            0.0f to Color(0xFF65D88D),
            0.2f to Color(0xFFBEF2D0),
            0.9f to Color(0xFFEEFBF2),
            1.0f to Color(0xFFF6F6F7),
        ),
    ),
)

@Immutable
data class KokColorScheme(
    // basic
    val white: Color,
    val black: Color,
    // gray
    val gray95: Color,
    val gray90: Color,
    val gray80: Color,
    val gray70: Color,
    val gray60: Color,
    val gray50: Color,
    val gray40: Color,
    val gray30: Color,
    val gray20: Color,
    val gray15: Color,
    val gray10: Color,
    // opacity
    val opacityBlack60: Color,
    val opacityBlack30: Color,
    val opacityWhite30: Color,
    val opacityOrange4: Color,
    val opacityPink4: Color,
    val opacityBlue4: Color,
    val opacityPurple4: Color,
    val opacityGreen4: Color,
    // orange
    val orange700: Color,
    val orange500Main: Color,
    val orange400: Color,
    val orange300: Color,
    val orange200: Color,
    val orange100Light: Color,
    val orangeDark: Color,
    // pink
    val pinkMain: Color,
    val pinkLight: Color,
    val pinkDark: Color,
    // blue
    val blueMain: Color,
    val blueLight: Color,
    val blueDark: Color,
    // purple
    val purpleMain: Color,
    val purpleLight: Color,
    val purpleDark: Color,
    // green
    val greenMain: Color,
    val greenLight: Color,
    val greenDark: Color,
    // red
    val redMain: Color,
    val redLight: Color,
    val redDark: Color,
    // gradient
    val orangeGradientMain: Brush,
    val orangeGradientMain2: Brush,
    val orangeGradientLight: Brush,
    val pinkGradientMain: Brush,
    val pinkGradientLight: Brush,
    val blueGradientMain: Brush,
    val blueGradientLight: Brush,
    val purpleGradientMain: Brush,
    val purpleGradientLight: Brush,
    val greenGradientMain: Brush,
    val greenGradientLight: Brush,
)

val LocalColorScheme = staticCompositionLocalOf {
    KokColorScheme(
        white = Color.Unspecified,
        black = Color.Unspecified,
        gray95 = Color.Unspecified,
        gray90 = Color.Unspecified,
        gray80 = Color.Unspecified,
        gray70 = Color.Unspecified,
        gray60 = Color.Unspecified,
        gray50 = Color.Unspecified,
        gray40 = Color.Unspecified,
        gray30 = Color.Unspecified,
        gray20 = Color.Unspecified,
        gray15 = Color.Unspecified,
        gray10 = Color.Unspecified,
        opacityBlack60 = Color.Unspecified,
        opacityBlack30 = Color.Unspecified,
        opacityWhite30 = Color.Unspecified,
        opacityOrange4 = Color.Unspecified,
        opacityPink4 = Color.Unspecified,
        opacityBlue4 = Color.Unspecified,
        opacityPurple4 = Color.Unspecified,
        opacityGreen4 = Color.Unspecified,
        orange700 = Color.Unspecified,
        orange500Main = Color.Unspecified,
        orange400 = Color.Unspecified,
        orange300 = Color.Unspecified,
        orange200 = Color.Unspecified,
        orange100Light = Color.Unspecified,
        orangeDark = Color.Unspecified,
        pinkMain = Color.Unspecified,
        pinkLight = Color.Unspecified,
        pinkDark = Color.Unspecified,
        blueMain = Color.Unspecified,
        blueLight = Color.Unspecified,
        blueDark = Color.Unspecified,
        purpleMain = Color.Unspecified,
        purpleLight = Color.Unspecified,
        purpleDark = Color.Unspecified,
        greenMain = Color.Unspecified,
        greenLight = Color.Unspecified,
        greenDark = Color.Unspecified,
        redMain = Color.Unspecified,
        redLight = Color.Unspecified,
        redDark = Color.Unspecified,
        orangeGradientMain = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        orangeGradientMain2 = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        orangeGradientLight = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        pinkGradientMain = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        pinkGradientLight = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        blueGradientMain = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        blueGradientLight = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        purpleGradientMain = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        purpleGradientLight = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        greenGradientMain = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
        greenGradientLight = Brush.linearGradient(
            colors = listOf(Color.Unspecified, Color.Unspecified),
        ),
    )
}
