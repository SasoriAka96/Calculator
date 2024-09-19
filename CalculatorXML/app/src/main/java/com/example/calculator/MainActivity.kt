package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numero = ""
        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonDelete: Button = findViewById(R.id.buttonDelete)
        val buttonComa: Button = findViewById(R.id.buttonComa)
        val textView: TextView = findViewById(R.id.textView)

        button0.setOnClickListener {
            numero += "0"
            textView.text = numero
        }
        button1.setOnClickListener {
            numero += "1"
            textView.text = numero
        }
        button2.setOnClickListener {
            numero += "2"
            textView.text = numero
        }
        button3.setOnClickListener {
            numero += "3"
            textView.text = numero
        }
        button4.setOnClickListener {
            numero += "4"
            textView.text = numero
        }
        button5.setOnClickListener {
            numero += "5"
            textView.text = numero
        }
        button6.setOnClickListener {
            numero += "6"
            textView.text = numero
        }
        button7.setOnClickListener {
            numero += "7"
            textView.text = numero
        }
        button8.setOnClickListener {
            numero += "8"
            textView.text = numero
        }
        button9.setOnClickListener {
            numero += "9"
            textView.text = numero
        }

        buttonComa.setOnClickListener {
            numero += ","
            textView.text = numero
        }
        buttonDelete.setOnClickListener{
            numero = ""
            textView.text = "0"

        }
    }
}
