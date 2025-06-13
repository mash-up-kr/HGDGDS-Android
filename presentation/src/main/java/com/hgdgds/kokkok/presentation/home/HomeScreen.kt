package com.hgdgds.kokkok.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.hgdgds.kokkok.designsystem.R
import com.hgdgds.kokkok.designsystem.theme.KokTheme

@Composable
fun HomeScreen(
    onReservationClick: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_kok_24),
            contentDescription = null,
            tint = KokTheme.colorScheme.blueMain,
        )
        Text(
            style = KokTheme.typography.display32Bold.copy(
                color = KokTheme.colorScheme.orange500Main,
            ),
            text = "Home",
        )
        Button(
            onClick = { onReservationClick("여기에 예약 아이디 넘김") },
        ) {
            Text("테스트")
        }
    }
}
