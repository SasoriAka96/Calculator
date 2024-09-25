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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
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
                        .padding(horizontal = 11.dp)
                        .border(width = 1.dp, color = Color.DarkGray),
                    value = "",
                    onValueChange = {},
                    placeholder = { Text(text = "0", color = Color.LightGray) },
                    textStyle = androidx.compose.material3.MaterialTheme.typography.bodyLarge
                )
            }

        }
        Column(
            modifier = Modifier.fillMaxWidth().height(500.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {

            Row(Modifier.padding(start = 10.dp)) {
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4283848278))
                ) {
                    Text(text = "AC")
                }
            }
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround) {
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523)),

                    ) {
                    Text(text = "7")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "8")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "9")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4279402906))
                ) {
                    Text(text = "x")
                }

            }
            Row (modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround) {
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "4")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "5")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "6")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4279402906))
                ) {
                    Text(text = "-")
                }
            }
            Row (modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround){
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "1")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "2")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "3")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(4279402906)
                    )
                ) {
                    Text(text = "+")
                }

            }
            Row (modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround){
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "0")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = ",")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "/")
                }
                Button(
                    onClick = {},
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4279402906))
                ) {
                    Text(text = "=")
                }

            }

        }

    }
}
