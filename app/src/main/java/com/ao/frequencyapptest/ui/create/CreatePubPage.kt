package com.ao.frequencyapptest.ui.create

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreatePubPage() {

    var description by remember { mutableStateOf("") }


    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Top
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            modifier = Modifier,
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Retorna para a página anterior",
                tint = Color.Black
            )
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var url by remember { mutableStateOf("") }

        // begin: Essa area serve para poder adicionar uma imagem a nosso banco de dados
        OutlinedTextField(
            value = url,
            onValueChange = { url = it },
            label = {
                Text(
                    text = "Url"
                )
            },
            modifier = Modifier
                .width(370.dp),
        )
        // end

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            label = {
                Text(text = "Descrição")
            },
            modifier = Modifier
                .height(400.dp)
                .width(370.dp),
        )
        Spacer(modifier = Modifier.height(12.dp))
        FloatingActionButton(
            onClick = {},
            modifier = Modifier,
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(
                text = "Add",
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreatePubPagePreview() {
    Surface(
        modifier = androidx.compose.ui.Modifier.fillMaxSize()
    ) {
        CreatePubPage()
    }
}