package com.example.javatokotlin

class LicenceServiceKotlin {
    fun getDriversLicence(personKotlin: PersonKotlin) = println(personKotlin.name)
}

class Police {
    fun checkIdentity(personKotlin: PersonKotlin) = "check identity"
    fun putInJail(personKotlin: PersonKotlin) = "put In Jail"
}
