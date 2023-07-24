package com.example.firstproject.hafta1.odev2

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var age: Int? = null

    try {
        println("Yaşınızı giriniz:")
        val input = scanner.nextLine()
        age = input.toInt()
    } catch (e: NumberFormatException) {
        println("Sayi Giriniz!")
        return
    }

    if (age != null && age >= 18) {
        println("Oy kullanabilirsiniz!")
    } else {
        println("Oy kullanamazsınız.")
    }
}