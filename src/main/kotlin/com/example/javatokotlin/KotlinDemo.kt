package com.example.javatokotlin

class KotlinDemo(
    val licenceServiceKotlin: LicenceServiceKotlin = LicenceServiceKotlin(),
    val police: Police = Police()
) {

    // 01 | Optional.map() vs. Safe-Call Operator
    fun accessProperties() = getNextCarIfPresentKotlin()?.driver?.age

    // 02 | Optional.map() vs. let() Function
    fun safeCallExternalMethod() =
        getNextCarIfPresentKotlin()?.driver?.let { licenceServiceKotlin.getDriversLicence(it) }

    // 03 | Optional.orElse() vs. Elvis Operator
    fun retrieveWithFallbackValue() {
        val isOfLegalAge = getNextCarIfPresentKotlin()?.driver?.age ?: 0 > 18
    }

    // 04 | Optional.get() vs. Assertion Operator
    fun sureNotNull() {
        val isOfLegalAge = getNextCarIfPresentKotlin()?.driver?.age!! > 18
    }

    // 05 | Optional.filter() vs. takeIf() Function
    fun checkConditionAndReturnAccordingly() {
        val illegalDriver =
            getNextCarIfPresentKotlin()?.driver.takeIf { it?.age ?: 0 < 18 }
    }

    // 06 | Optional.ifPresent() vs. let() Function
    fun useWrappedValueInOtherLogic() {
        getNextCarIfPresentKotlin()?.driver.takeIf { it?.age ?: 0 < 18 }
            ?.let {
                police.checkIdentity(it)
                police.putInJail(it)
            }
    }
}
