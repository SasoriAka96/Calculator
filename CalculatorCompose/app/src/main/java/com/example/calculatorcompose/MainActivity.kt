package com.example.calculatorcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
<<<<<<< HEAD
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
=======
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
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
<<<<<<< HEAD
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
=======
import androidx.compose.runtime.Composable
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
<<<<<<< HEAD
import androidx.compose.ui.unit.sp
=======
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
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
<<<<<<< HEAD
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Row(Modifier.height(430.dp), verticalAlignment = Alignment.Bottom) {
=======
        verticalArrangement = Arrangement.Center
    ) {
        Column {
            Row {
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 11.dp)
<<<<<<< HEAD
                        .padding(bottom = 80.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent
                    ),
                    value = "",
                    onValueChange = {},
                    placeholder = { Text(text = "0", color = Color.LightGray, fontSize = 80.sp) },
                    textStyle = androidx.compose.material3.MaterialTheme.typography.bodyLarge,

                    )
=======
                        .border(width = 1.dp, color = Color.DarkGray),
                    value = "",
                    onValueChange = {},
                    placeholder = { Text(text = "0", color = Color.LightGray) },
                    textStyle = androidx.compose.material3.MaterialTheme.typography.bodyLarge
                )
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
            }

        }
        Column(
<<<<<<< HEAD
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(bottom = 70.dp),
=======
            modifier = Modifier.fillMaxWidth().height(500.dp),
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
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
<<<<<<< HEAD
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
=======
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround) {
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
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
<<<<<<< HEAD
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
=======
            Row (modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround) {
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
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
<<<<<<< HEAD
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
=======
            Row (modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround){
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
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
<<<<<<< HEAD
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
=======
            Row (modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceAround){
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
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
<<<<<<< HEAD
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4279402906))
=======
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
>>>>>>> cc4f0274565d516177ae53e12381b95da2749604
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
