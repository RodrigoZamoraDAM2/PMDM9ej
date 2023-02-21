package com.example.pmdm9ej

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pmdm9ej.databinding.CharacterdetailsBinding
import kotlin.random.Random

class CharacterDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = CharacterdetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val clase = intent.getStringExtra("clase")
        val raza = intent.getStringExtra("raza")

        if (raza == "humano")
            binding.imgraza.setImageResource(R.drawable.humano)
        else if (raza == "elfo")
            binding.imgraza.setImageResource(R.drawable.elfo)
        else if (raza == "enano")
            binding.imgraza.setImageResource(R.drawable.enano)
        else
            binding.imgraza.setImageResource(R.drawable.goblin)

        if (clase == "ladron")
            binding.imgclase.setImageResource(R.drawable.ladron)
        else if(clase == "berserker")
            binding.imgclase.setImageResource(R.drawable.berserker)
        else if(clase == "mago")
            binding.imgclase.setImageResource(R.drawable.mago)
        else if(clase == "guerrero")
            binding.imgclase.setImageResource(R.drawable.guerrero)
        else if(clase == "arquero")
            binding.imgclase.setImageResource(R.drawable.arquero)
        else
            binding.imgclase.setImageResource(R.drawable.mercader)

        binding.fuerza.text = Random.nextInt(10,15).toString()
        binding.defensa.text = Random.nextInt(1,5).toString()
        binding.mochila.text = "100"
        binding.vida.text = "200"
        binding.monedero.text = "0"

        binding.volverboton.setOnClickListener(){
            val intent = Intent(this@CharacterDetails,Race::class.java)
            startActivity(intent)
        }

        binding.comenzarboton.setOnClickListener(){
            val intent = Intent(this@CharacterDetails,Blank::class.java)
            startActivity(intent)
        }

    }
}