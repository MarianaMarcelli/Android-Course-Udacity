package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var imagemDado: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoRolarDados = findViewById<Button>(R.id.btnRoll)

        botaoRolarDados.setOnClickListener {
            rolarDados()
        }
        imagemDado = findViewById<ImageView>(R.id.imagemDados)
    }

    private fun rolarDados() {
        val randomInt = Random().nextInt(6) + 1

        val imagemRolandoDados = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imagemDado.setImageResource(imagemRolandoDados)
    }
}