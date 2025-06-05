package com.hgdgds.kokkok

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.hgdgds.kokkok.ui.KokApp
import com.hgdgds.kokkok.ui.rememberKokAppState
import com.hgdgds.kokkok.ui.theme.KokKokTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val appState = rememberKokAppState()

            KokKokTheme {
                KokApp(appState)
            }
        }
    }
}