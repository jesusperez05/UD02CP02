package com.example.ud02cp02

val asientos = mutableMapOf<String, Boolean>()
val filas = 'A'..'E'

fun main() {

    for (fila in filas) {
        for (num in 1..5) {
            asientos["$fila$num"] = false
        }
    }
    var salir = false
    while (!salir) {
        println("--- CINE ---")
        println("1. Mostrar mapa")
        println("2. Reservar")
        println("3. Cancelar")
        println("4. Salir")
        print("Elige: ")

        when (readLine()?.toIntOrNull()) {
            1 -> mostrarMapa()
            2 -> reservar()
            3 -> cancelar()
            4 -> salir=true
            else -> println("Opción no válida.")
        }
    }
}

fun mostrarMapa() {
    for (fila in filas) {
        for (num in 1..5) {
            val clave = "$fila$num"
            val estado = asientos[clave]
            when (estado) {
                true -> print("[X]")
                false -> print("[ ]")
                null -> print("[?]")
            }
        }
        println()
    }
}

fun reservar() {
    print("Asiento (ej. A1): ")
    val asiento = (readLine() ?: "").uppercase()
    try {
        val disponible = asientos[asiento] ?: throw IllegalArgumentException("Asiento no existe")
        if (disponible) throw IllegalStateException("Asiento ocupado")
        asientos[asiento] = true
        println("Reservado.")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}

fun cancelar() {
    print("Asiento (ej. A1): ")
    val asiento = (readLine() ?: "").uppercase()
    try {
        val ocupado = asientos[asiento] ?: throw IllegalArgumentException("Asiento no existe")
        if (!ocupado) throw IllegalStateException("Asiento no está reservado")
        asientos[asiento] = false
        println("Cancelado.")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}