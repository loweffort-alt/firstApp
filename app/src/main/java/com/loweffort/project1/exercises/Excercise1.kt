package com.loweffort.project1.exercises

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val random = -13

    val isMonday = false

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}")
    println("The movie ticket price for a person aged $random is \$${ticketPrice(random, isMonday)}")
}

fun ticketPrice(age:Int, isMonday:Boolean):Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) return 25 else return 30
        in 61..100 -> 20
        else -> -1
    }
}