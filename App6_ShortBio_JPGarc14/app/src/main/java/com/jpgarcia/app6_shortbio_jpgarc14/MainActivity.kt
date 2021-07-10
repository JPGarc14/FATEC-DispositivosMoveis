package com.jpgarcia.app6_shortbio_jpgarc14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var botaoSobre: Button
lateinit var botaoFormacao: Button
lateinit var botaoExperiencia: Button
lateinit var botaoObjetivo: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoSobre = findViewById(R.id.sobre)
        botaoFormacao = findViewById(R.id.formacao)
        botaoExperiencia = findViewById(R.id.experiencia)
        botaoObjetivo = findViewById(R.id.objetivo)

        botaoSobre.setOnClickListener {
            val act_sobre = Intent(this@MainActivity, sobre::class.java)
            startActivity(act_sobre)
        }

        botaoFormacao.setOnClickListener {
            val act_formacao = Intent(this@MainActivity, formacao::class.java)
            startActivity(act_formacao)
        }

        botaoExperiencia.setOnClickListener {
            val act_experiencia = Intent(this@MainActivity, experiencia::class.java)
            startActivity(act_experiencia)
        }

        botaoObjetivo.setOnClickListener {
            val act_objetivo = Intent(this@MainActivity, objetivo::class.java)
            startActivity(act_objetivo)
        }


    }
}