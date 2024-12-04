package com.ao.frequencyapptest.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ao.frequencyapptest.ui.component.ImageCard

@Composable
fun HomePage() {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                content = {
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Volta a página anterior",
                            tint = Color.Black
                        )
                    }
                }
            )

            LazyColumn {
                items(3) {
                    ImageCard()
                }
            }
        }

        FloatingActionButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .size(100.dp)
                .padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Adiciona um novo card",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    HomePage()
}