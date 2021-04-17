package com.example.javatokotlin;

public class LicenceServiceJava {
    public String getDriversLicence(PersonJava personJava) {
        return "Performing get driver's licence action";
    }
}

public class Police {
    public String checkIdentity(PersonJava personJava) {
        return "checking Identity";
    }
    public String putInJail(PersonJava personJava){
        return "put into jail";
    }
}
