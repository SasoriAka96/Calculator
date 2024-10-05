package com.example.calculatorcompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    device = "spec:width=448dp,height=998dp,orientation=landscape"
)
@Preview(
    showBackground = true, showSystemUi = true,
    device = "spec:width=448dp,height=998dp,orientation=portrait"
)

@Composable
fun Calculadora() {

    val configuration = LocalConfiguration.current

    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {

            LandscapeScreenComposition()
        }

        else -> {
            VerticalScreenComposition()
        }

    }


}

@Composable
fun LandscapeScreenComposition() {
    var numero by remember { mutableStateOf("") }
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.Black),
    ) {
        Row {
            Column(
                modifier = Modifier
                    .width(500.dp)
                    .padding(start = 70.dp)
                    .padding(top = 50.dp),
                verticalArrangement = Arrangement.SpaceAround
            ) {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp),

                    ) {
                    Button(
                        onClick = { numero = "" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4283848278))
                    ) {
                        Text(text = "AC")
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { numero += "7" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523)),

                        ) {
                        Text(text = "7")
                    }
                    Button(
                        onClick = { numero += "8" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = "8")
                    }
                    Button(
                        onClick = { numero += "9" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = "9")
                    }
                    Button(
                        onClick = {},
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4279402906))
                    ) {
                        Text(text = "x")
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { numero += "4" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = "4")
                    }
                    Button(
                        onClick = { numero += "5" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = "5")
                    }
                    Button(
                        onClick = { numero += "6" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = "6")
                    }
                    Button(
                        onClick = {},
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4279402906))
                    ) {
                        Text(text = "-")
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { numero += "1" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = "1")
                    }
                    Button(
                        onClick = { numero += "2" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = "2")
                    }
                    Button(
                        onClick = { numero += "3" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = "3")
                    }
                    Button(
                        onClick = {},
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(4279402906)
                        )
                    ) {
                        Text(text = "+")
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { numero += "0" },
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = "0")
                    }
                    Button(
                        onClick = {},
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                    ) {
                        Text(text = ",")
                    }
                    Button(
                        onClick = {},
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4279402906))
                    ) {
                        Text(text = "/")
                    }
                    Button(
                        onClick = {},
                        Modifier
                            .height(61.dp)
                            .width(85.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4279402906))
                    ) {
                        Text(text = "=")
                    }

                }
            }
            TextField(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(500.dp)
                    .padding(top = 20.dp)
                    .padding(start = 70.dp)
                    .padding(end = 70.dp)
                    .padding(bottom = 40.dp),

                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "0$numero",
                        color = Color.LightGray,
                        fontSize = 80.sp,
                        lineHeight = 70.sp,
                    )
                },
                textStyle = androidx.compose.material3.MaterialTheme.typography.bodyLarge,

                )


        }

    }
}


@Composable
fun VerticalScreenComposition() {
    var numero by remember { mutableStateOf("") }
    val scrollScrollState = rememberScrollState()
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column {
            Row(Modifier.height(430.dp), verticalAlignment = Alignment.Bottom) {
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 11.dp)
                        .padding(bottom = 80.dp)
                        .horizontalScroll(scrollScrollState),

                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(
                            text = "0$numero",
                            color = Color.LightGray,
                            fontSize = 80.sp,
                        )
                    },
                    textStyle = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
                    singleLine = true,
                )
            }

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(bottom = 70.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {

            Row(Modifier.padding(start = 10.dp)) {
                Button(
                    onClick = { numero = "" },
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4283848278))
                ) {
                    Text(text = "AC")
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = { numero += "7" },
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523)),

                    ) {
                    Text(text = "7")
                }
                Button(
                    onClick = { numero += "8" },
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "8")
                }
                Button(
                    onClick = { numero += "9" },
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = { numero += "4" },
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "4")
                }
                Button(
                    onClick = { numero += "5" },
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "5")
                }
                Button(
                    onClick = { numero += "6" },
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = { numero += "1" },
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "1")
                }
                Button(
                    onClick = { numero += "2" },
                    Modifier
                        .height(71.dp)
                        .width(90.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4281545523))
                ) {
                    Text(text = "2")
                }
                Button(
                    onClick = { numero += "3" },
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = { numero += "0" },
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
                    colors = ButtonDefaults.buttonColors(containerColor = Color(4279402906))
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



