package com.example.iuaplicacionsencilla1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textoResultado = findViewById<TextView>(R.id.respuesta)
        val textoEscrito = findViewById<EditText>(R.id.editTextText)
        button.setOnClickListener { _ ->
            textoResultado.text = textoEscrito.text
        }
    }
}