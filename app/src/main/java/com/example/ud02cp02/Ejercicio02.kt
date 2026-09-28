package com.example.ud02cp02

val tareas = mutableListOf<String>()

fun main() {
    elegirOpcion()
}

fun elegirOpcion() {
    menu()
    print("Introduce un número: ")
    var n: Int = readlnOrNull()?.toIntOrNull() ?: 0
    when (n){
        1 -> anadir()
        2 -> completar()
        3 -> listar()
        4 -> {
            val listaP=pendientes()
            for (tarea in listaP)
                println("Tarea: " + tarea)
            elegirOpcion()
        }
        5 -> System.exit(0)
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
    var tarea: String = readlnOrNull()!!
    tareas.add(tarea)
    elegirOpcion()
}

fun completar() {
    print("Introduce el índice de la tarea a completar: ")
    var indice: Int = readlnOrNull()?.toIntOrNull()!!
    tareas.get(indice)
    tareas[indice] += "[X]"
    elegirOpcion()
}

fun listar() {
    tareas.forEach {
        println("Tarea " + tareas.indexOf(it.trim()) + ": " + it.trim())
    }
    elegirOpcion()
}

fun pendientes(): List<String> {
    return (tareas.filter { !it.endsWith("[X]") })
}