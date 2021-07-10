package com.jpgarcia.app6_shortbio_jpgarc14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class experiencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experiencia)

        lateinit var botaoVoltar: Button
        botaoVoltar = findViewById(R.id.voltar)

        botaoVoltar.setOnClickListener{
            val voltar = Intent(this@experiencia, MainActivity::class.java)
            startActivity(voltar)
        }

    }
}