package com.example.javatokotlin

class KotlinDemo(
    val licenceServiceKotlin: LicenceServiceKotlin = LicenceServiceKotlin(),
    val police: Police = Police()
) {

    // 01 | Optional.map() vs. Safe-Call Operator
    fun accessProperties() = getNextCarIfPresentKotlin()?.driver?.age
}
