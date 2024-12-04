package com.ao.frequencyapptest.ui.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ao.frequencyapptest.ui.component.CardImage

@Composable
fun DetailPage() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column (
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            CardImage("https://i.pinimg.com/736x/a3/e0/1b/a3e01b0e28c3c7255e62cc602779082f.jpg")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Top,
            ) {
                Text(
                    text = "Data"
                )
            }

            Text(
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(18.dp),
                text = "Informações"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailPagePreview() {
    DetailPage()
}