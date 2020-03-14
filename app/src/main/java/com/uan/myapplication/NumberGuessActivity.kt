package com.uan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class NumberGuessActivity : AppCompatActivity() {

    var numeroRandom= Random.nextInt(0,1000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guess_number)

        val botonJugar=findViewById<Button>(R.id.buttonJugar)
        val numeroUsuario=findViewById<EditText>(R.id.editTextNumero)


        botonJugar.setOnClickListener{

            view -> adivinar(numeroUsuario.text.toString().toInt(), numeroRandom)

        }

        val botonReiniciar=findViewById<Button>(R.id.buttonReiniciar)


        botonReiniciar.setOnClickListener{

                view -> reiniciar()

        }

    }

    fun adivinar(x: Int , y: Int){

        val texto=findViewById<TextView>(R.id.txtResultado)

        if (x>y)
            texto.setText("Pista! :El numero que buscas es menor ")

        else if (x<y)
            texto.setText("Pista! :El numero que buscas es mayor ")
        else
            texto.setText("Haz acertado!")


    }

    fun reiniciar(){
        val texto=findViewById<TextView>(R.id.txtResultado)
        val numeroUsuario=findViewById<EditText>(R.id.editTextNumero)
        texto.setText("Pista!:")
        numeroRandom= Random.nextInt(0,1000)
        numeroUsuario.setText("0")


    }

}
