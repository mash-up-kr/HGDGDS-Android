package com.hgdgds.kokkok.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.sp
import com.hgdgds.kokkok.designsystem.R

internal val suitFamily = FontFamily(
    Font(R.font.suit_regular, FontWeight.Bold),
    Font(R.font.suit_medium, FontWeight.SemiBold),
    Font(R.font.suit_bold, FontWeight.Medium),
    Font(R.font.suit_extrabold, FontWeight.Medium),
)

private val suitStyle = TextStyle(
    fontFamily = suitFamily,
    platformStyle = PlatformTextStyle(
        includeFontPadding = false,
    ),
    lineHeightStyle = LineHeightStyle(
        alignment = LineHeightStyle.Alignment.Center,
        trim = LineHeightStyle.Trim.None,
    ),
)

internal val Typography = KokTypography(
    // display32
    display32Bold = suitStyle.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 43.2.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    // heading24
    heading24Bold = suitStyle.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 32.4.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    heading24Medium = suitStyle.copy(
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        lineHeight = 32.4.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    heading24Regular = suitStyle.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 32.4.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    // title20
    title20Bold = suitStyle.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 27.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    title20Medium = suitStyle.copy(
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 27.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    title20Regular = suitStyle.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 27.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    // subtitle18
    subtitle18Bold = suitStyle.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 24.3.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    subtitle18Medium = suitStyle.copy(
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 24.3.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    subtitle18Regular = suitStyle.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 24.3.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    // body16
    body16Bold = suitStyle.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    body16Medium = suitStyle.copy(
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    body16Regular = suitStyle.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    // body14
    body14Bold = suitStyle.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 21.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    body14Medium = suitStyle.copy(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 21.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    body14Regular = suitStyle.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 21.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    // caption12
    caption12Bold = suitStyle.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    caption12Medium = suitStyle.copy(
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    caption12Regular = suitStyle.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    // caption11
    caption11Bold = suitStyle.copy(
        fontWeight = FontWeight.Bold,
        fontSize = 11.sp,
        lineHeight = 16.5.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    caption11Medium = suitStyle.copy(
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.5.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
    caption11Regular = suitStyle.copy(
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
        lineHeight = 16.5.sp,
        letterSpacing = TextUnit(-0.022f, TextUnitType.Em),
    ),
)

@Immutable
data class KokTypography(
    // display32
    val display32Bold: TextStyle,
    // heading24
    val heading24Bold: TextStyle,
    val heading24Medium: TextStyle,
    val heading24Regular: TextStyle,
    // title20
    val title20Bold: TextStyle,
    val title20Medium: TextStyle,
    val title20Regular: TextStyle,
    // subtitle
    val subtitle18Bold: TextStyle,
    val subtitle18Medium: TextStyle,
    val subtitle18Regular: TextStyle,
    // body16
    val body16Bold: TextStyle,
    val body16Medium: TextStyle,
    val body16Regular: TextStyle,
    // body14
    val body14Bold: TextStyle,
    val body14Medium: TextStyle,
    val body14Regular: TextStyle,
    // caption12
    val caption12Bold: TextStyle,
    val caption12Medium: TextStyle,
    val caption12Regular: TextStyle,
    // caption11
    val caption11Bold: TextStyle,
    val caption11Medium: TextStyle,
    val caption11Regular: TextStyle,
)

val LocalTypography = staticCompositionLocalOf {
    KokTypography(
        display32Bold = suitStyle,
        heading24Bold = suitStyle,
        heading24Medium = suitStyle,
        heading24Regular = suitStyle,
        title20Bold = suitStyle,
        title20Medium = suitStyle,
        title20Regular = suitStyle,
        subtitle18Bold = suitStyle,
        subtitle18Medium = suitStyle,
        subtitle18Regular = suitStyle,
        body16Bold = suitStyle,
        body16Medium = suitStyle,
        body16Regular = suitStyle,
        body14Bold = suitStyle,
        body14Medium = suitStyle,
        body14Regular = suitStyle,
        caption12Bold = suitStyle,
        caption12Medium = suitStyle,
        caption12Regular = suitStyle,
        caption11Bold = suitStyle,
        caption11Medium = suitStyle,
        caption11Regular = suitStyle,
    )
}
