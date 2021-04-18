package com.example.javatokotlin;

import org.springframework.stereotype.Component;

public class LicenceServiceJava {
    public String getDriversLicence(PersonJava driver) {
        return "getDriversLicence: " + driver.getName();
    }
}

class PoliceJava {
    public String checkIdentity(PersonJava personJava) {
        return "checking Identity";
    }
    public String putInJail(PersonJava personJava){
        return "put into jail";
    }
}
