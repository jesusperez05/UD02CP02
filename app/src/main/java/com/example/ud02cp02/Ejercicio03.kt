package com.example.ud02cp02

fun main() {
    println("Introduce un texto:")
    val entrada = readLine() ?: ""
    val texto = entrada.lowercase().replace(" ", "")
    val vecesLetras = mutableMapOf<Char, Int>()

    for (letra in texto) {
        val contadorActual = vecesLetras.getOrDefault(letra, 0)
        vecesLetras[letra] = contadorActual + 1
    }

    val resultadoOrdenado = vecesLetras.toList().sortedByDescending { it.second }

    for ((letra, cuenta) in resultadoOrdenado) {
        println("Letra $letra: $cuenta veces")
    }
}