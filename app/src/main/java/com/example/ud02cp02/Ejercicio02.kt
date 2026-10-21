package com.example.ud02cp02

val tareas = mutableListOf<String>()

fun List<String>.obtenerPendientes(): List<String> {
    return this.filter { !it.startsWith("[X]") }
}

fun main() {
    var activo = true
    while (activo) {
        menu()
        print("Introduce un número: ")
        val n = readLine()?.toIntOrNull() ?: 0
        when (n) {
            1 -> anadir()
            2 -> completar()
            3 -> listar()
            4 -> mostrarPendientes()
            5 -> activo = false
            else -> println("Opción no válida.")
        }
        println()
    }
}

fun menu() {
    println("1. Añadir")
    println("2. Completar")
    println("3. Listar")
    println("4. Pendientes")
    println("5. Salir")
}

fun anadir() {
    print("Introduce la tarea a hacer: ")
    val tarea = readLine() ?: ""
    if (tarea.isNotBlank()) {
        tareas.add(tarea)
    }
}

fun completar() {
    print("Introduce el número de la tarea a completar: ")
    val numero = readLine()?.toIntOrNull() ?: -1
    if (numero in 1..tareas.size) {
        val indice = numero - 1
        if (!tareas[indice].startsWith("[X]")) {
            tareas[indice] = "[X] " + tareas[indice]
        }
    } else {
        println("Número de tarea no válido.")
    }
}

fun listar() {
    for (i in tareas.indices) {
        println("Tarea ${i + 1}: ${tareas[i]}")
    }
}

fun mostrarPendientes() {
    val listaP = tareas.obtenerPendientes()
    for (tarea in listaP) {
        println("Tarea: $tarea")
    }
}