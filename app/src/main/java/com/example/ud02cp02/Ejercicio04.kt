package com.example.ud02cp02

fun main() {
    print("Introduce una contraseña: ")
    val contrasena : String = readln() ?: ""

    if (contrasena.length < 8) {
        println("La contraseña es muy corta")
    }

    if (!contrasena.any() {it.isUpperCase()}) {
        println("La contraseña debe tener al menos una mayúscula")
    }

    if (!contrasena.any() {it.isLowerCase()}) {
        println("La contraseña debe tener al menos una minúscula")
    }

    if (!contrasena.any() {it.isDigit()}) {
        println("La contraseña debe tener al menos un dígito")
    }

    if (!contrasena.any() {!it.isLetterOrDigit()}) {
        println("La contraseña debe tener al menos un carácter especial")
    }
}