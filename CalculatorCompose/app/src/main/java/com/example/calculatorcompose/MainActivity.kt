package com.example.calculatorcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculatorcompose.ui.theme.CalculatorComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorComposeTheme {
                Calculadora()
            }
        }
    }
}

@Preview(
    showBackground = true, showSystemUi = true,
    device = "id:pixel_8_pro"
)

@Composable
fun Calculadora() {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        verticalArrangement = Arrangement.Center
    ) {
        Column {
            Row {
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .border(width = 1.dp, color = Color.DarkGray),
                    value = "",
                    onValueChange = {},
                    placeholder = { Text(text = "0", color = Color.LightGray) },
                    textStyle = androidx.compose.material3.MaterialTheme.typography.bodyLarge
                )
            }

        }
        Column(
            Modifier
                .background(color = Color.Red)
                .align(alignment = Alignment.CenterHorizontally),

            )
        {

            Row {
                Button(onClick = {
                }) {

                    Text(text = "AC")
                }
            }
            Row {
                Button(onClick = {
                }) {
                    Text(text = "7")
                }
                Button(onClick = {
                }) {
                    Text(text = "8")
                }
                Button(onClick = {
                }) {
                    Text(text = "9")
                }
                Button(onClick = {
                }) {
                    Text(text = "x")
                }

            }
            Row {
                Button(onClick = {
                }) {
                    Text(text = "4")
                }
                Button(onClick = {
                }) {
                    Text(text = "5")
                }
                Button(onClick = {
                }) {
                    Text(text = "6")
                }
                Button(onClick = {
                }) {
                    Text(text = "-")
                }
            }
            Row {
                Button(onClick = {
                }) {
                    Text(text = "1")
                }
                Button(onClick = {
                }) {
                    Text(text = "2")
                }
                Button(onClick = {
                }) {
                    Text(text = "3")
                }
                Button(onClick = {
                }) {
                    Text(text = "+")
                }

            }
            Row {
                Button(onClick = {
                }) {
                    Text(text = "0")
                }
                Button(onClick = {
                }) {
                    Text(text = ",")
                }
                Button(onClick = {
                }) {
                    Text(text = "/")
                }
                Button(onClick = {
                }) {
                    Text(text = "=")
                }

            }

        }
    }
}
