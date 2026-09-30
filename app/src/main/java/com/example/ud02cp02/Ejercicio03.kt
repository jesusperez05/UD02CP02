package com.example.ud02cp02

fun main() {
    println("Introduce un texto:")
    val entrada = readLine() ?: ""
    val texto = entrada.lowercase().replace(" ", "")
    val frecuencias = mutableMapOf<Char, Int>()

    for (letra in texto) {
        val contadorActual = frecuencias.getOrDefault(letra, 0)
        frecuencias[letra] = contadorActual + 1
    }

    val resultadoOrdenado = frecuencias.toList().sortedByDescending { it.second }

    for ((letra, cuenta) in resultadoOrdenado) {
        println("Letra $letra: $cuenta veces")
    }
}