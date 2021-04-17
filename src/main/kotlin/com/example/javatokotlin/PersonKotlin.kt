package com.example.javatokotlin

import kotlin.random.Random

class PersonKotlin(val name: String, val age: Int?)

class CarKotlin(val driver: PersonKotlin)

fun getNextCarIfPresentKotlin(): CarKotlin? {
    val nextInt = Random(20).nextInt()
    return if (nextInt > 10) null else CarKotlin(PersonKotlin("Lintao", null))
}
