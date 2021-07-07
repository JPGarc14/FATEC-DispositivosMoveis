package com.jpgarcia.aula04_alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

lateinit var rslt: TextView
lateinit var btn: Button
var alc: Double? = null
var gas: Double? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rslt = findViewById(R.id.textView4)
        btn = findViewById(R.id.button)

        btn.setOnClickListener{
            alc = findViewById<TextView>(R.id.alcool).text.toString().toDoubleOrNull()
            gas = findViewById<TextView>(R.id.gasolina).text.toString().toDoubleOrNull()
            AlcoolGasolina()
        }
    }

    fun AlcoolGasolina(){
        var resultado = ""

        alc?.let{
            gas?.let{
                var calcPreco = alc!! / it

                if(calcPreco < 0.7){
                    resultado = "Melhor utilizar álcool!"
                }else{
                    resultado = "Melhor utilizar gasolina!"
                }
            }
        }

        rslt.text = resultado

    }
}