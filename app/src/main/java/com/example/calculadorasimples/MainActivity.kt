package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadorasimples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener {}


    }

    fun Calculadora() {
        val numero1DoLayout = binding.insiraNumeros1.text.toString().toDouble()
        val numero2Dolayout = binding.insiraNumeros1.text.toString().toDouble()
        val operacaoSelecionada = binding.radiogroup1.checkedRadioButtonId
        val resultado = when (operacaoSelecionada) {
            R.id.opcaoSomar -> Calculadora().Somar(numero1DoLayout, numero2Dolayout)
            else -> Calculadora().Dividir(numero1DoLayout, numero2Dolayout)
        }

        binding.mostrarResultado.text = resultado.toString()
    }

}

  class Calculadora{
      fun Somar(n1: Double, n2: Double): Double{
          var soma = n1 + n2
          return (soma)
      }

      fun Dividir(n1 : Double, n2: Double):Double{
          var divisao = n1 + n2
          return (divisao)


      }

  }







