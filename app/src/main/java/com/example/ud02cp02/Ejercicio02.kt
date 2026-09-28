package com.example.ud02cp02

val tareas = mutableListOf<String>()

fun main() {
    menu()
}

fun menu() {
    val salir = false
    while (!salir) {
        print("Introduce un número: ")
        var n: Int = readlnOrNull()?.toIntOrNull() ?: 0
        when {
            n == 1 -> anadir()
            n == 2 -> completar()
            n == 3 -> listar()
            n == 5 -> salir == true
        }
    }
}

fun anadir() {
    print("Introduce la tarea a hacer: ")
    var tarea: String = readlnOrNull()!!
    tareas.add(tarea)
    listar()
}

fun completar() {
    print("Introduce el índice de la tarea a completar: ")
    var indice: Int = readlnOrNull()?.toIntOrNull()!!
    tareas[indice].replaceAfter()
    listar()
}

fun listar() {
    tareas.forEach {
        println("Tarea " + tareas.indexOf(it.trim()) + ": " + it.trim())
    }
}

fun pendientes() {
    if ()
}