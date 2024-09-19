package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


    }

    private fun ponerNumeroEnPantalla(){
        val boton0: Button = findViewById(R.id.button0)
        val boton1: Button = findViewById(R.id.button1)
        val boton2: Button = findViewById(R.id.button2)
        val boton3: Button = findViewById(R.id.button3)
        val boton4: Button = findViewById(R.id.button4)
        val boton5: Button = findViewById(R.id.button5)
        val boton6: Button = findViewById(R.id.button6)
        val boton7: Button = findViewById(R.id.button7)
        val boton8: Button = findViewById(R.id.button8)
        val boton9: Button = findViewById(R.id.button9)
        val botonMenos: Button = findViewById(R.id.buttonMinus)
        val botonMas: Button = findViewById(R.id.buttonPlus)
        val botonIgual: Button = findViewById(R.id.buttonEquals)
        val botonMultiplicar: Button = findViewById(R.id.buttonMultiply)

    }
}
