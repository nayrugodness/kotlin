package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById<Text>(R.id.btn)
        btn.setOnClickListener{onClick()}
    }

    private fun onClick(){
        val campoTexto:EditText=findViewById(R.id.direccion)
        var direccion:String=campoTexto.text.toString()
        Toast.makeText(content:this, text: "Bienvenido $direccion", Toast.LENGTH_LONG).show()
    }
}