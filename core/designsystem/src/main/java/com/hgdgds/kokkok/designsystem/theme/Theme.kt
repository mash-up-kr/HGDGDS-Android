package com.hgdgds.kokkok.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun KokTheme(
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalColorScheme provides ColorScheme,
        LocalTypography provides Typography,
    ) {
        MaterialTheme(
            colorScheme = lightColorScheme(
                background = KokTheme.colorScheme.white,
            ),
            content = content,
        )
    }
}

object KokTheme {
    val typography: KokTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val colorScheme: KokColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current
}
