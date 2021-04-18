package com.example.javatokotlin

class LicenceServiceKotlin {
    fun getDriversLicence(driver: PersonKotlin) = println("getDriversLicence: ${driver.name}")
}

class Police {
    fun checkIdentity(personKotlin: PersonKotlin) = "check identity"
    fun putInJail(personKotlin: PersonKotlin) = "put In Jail"
}
