package com.example.ud02cp02

fun main() {
    var datosCSV : String = """Ana,7,8,9
                            Luis,5,6,4
                            Marta,9,10,8"""

    var alumnos = datosCSV.split("\n");

    for (alumno in alumnos) {
        val datos = alumno.split(",")
        val nombre = datos[0].trim()
        val media = (datos[1].toInt() + datos[2].toInt() + datos[3].toInt()) / 3
        val nota = when {
            media < 5 -> "Suspenso"
            media < 7 -> "Aprobado"
            media < 9 -> "Notable"
            else -> "Sobresaliente"
        }
        println("Nombre: $nombre")
        println("Media: $media")
        println("Nota: $nota")
        println()
    }
}