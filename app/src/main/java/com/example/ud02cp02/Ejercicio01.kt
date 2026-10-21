package com.example.ud02cp02

fun main() {
    val datosCSV: String = """nombre,nota1,nota2,nota3
Ana,7,8,9
Luis,5,6,4
Marta,9,10,8""".trimIndent()

    val lineas = datosCSV.split("\n")

    for (i in 1 until lineas.size) {
        val alumno = lineas[i]
        val datos = alumno.split(",")

        val nombre = datos[0].trim()
        val nota1 = datos[1].trim().toDouble()
        val nota2 = datos[2].trim().toDouble()
        val nota3 = datos[3].trim().toDouble()

        val notas = listOf(nota1, nota2, nota3)
        val media = notas.average()

        val nota = when {
            media < 5.0 -> "Suspenso"
            media < 7.0 -> "Aprobado"
            media < 9.0 -> "Notable"
            else -> "Sobresaliente"
        }

        println("Nombre: $nombre")
        println("Notas: $notas")
        println("Media: $media")
        println("Nota: $nota")
        println()
    }
}