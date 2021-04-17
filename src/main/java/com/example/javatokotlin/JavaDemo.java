package com.example.javatokotlin;

import java.util.Optional;

public class JavaDemo {
    private LicenceServiceJava licenceServiceJava;
    private Police police = new Police();

    // 01 | Optional.map() vs. Safe-Call Operator
    public void accessProperties() {
        Optional<Integer> integer = Util.getNextCarIfPresentJava()
                .map(CarJava::getDriver)
                .flatMap(PersonJava::getAge);
    }

    // 02 | Optional.map() vs. let() Function
    public void safeCallExternalMethod() {
        Util.getNextCarIfPresentJava()
                .map(CarJava::getDriver)
                .map(licenceServiceJava::getDriversLicence);
    }

    // Optional.orElse() vs. Elvis Operator
    public void retrieveWithFallbackValue() {
        boolean isOfLegalAge = Util.getNextCarIfPresentJava()
                .map(CarJava::getDriver)
                .flatMap(PersonJava::getAge)
                .orElse(0) > 18;
    }

    // 04 | Optional.get() vs. Assertion Operator
    public void sureNotNull() {
        boolean isOfLegalAge = Util.getNextCarIfPresentJava()
                .map(CarJava::getDriver)
                .flatMap(PersonJava::getAge)
                .get() > 18;
    }

    // 05 | Optional.filter() vs. takeIf() Function
    public void checkConditionAndReturnAccordingly() {
         Optional<PersonJava> illegalDriver = Util.getNextCarIfPresentJava()
                .map(CarJava::getDriver)
                .filter(person -> person.getAge().orElse(0) < 18);
    }

    // 06 | Optional.ifPresent() vs. let() Function
    public void useWrappedValueInOtherLogic() {
        Util.getNextCarIfPresentJava()
                .map(CarJava::getDriver)
                .filter(person -> person.getAge().orElse(0) < 18)
                .ifPresent(illegalDriver -> {
                    police.checkIdentity(illegalDriver);
                    police.putInJail(illegalDriver);
                });
    }
}
