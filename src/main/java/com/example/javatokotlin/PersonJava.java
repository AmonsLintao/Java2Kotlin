package com.example.javatokotlin;

import java.util.Optional;
import java.util.Random;

class PersonJava {
    private String name;
    private Optional<Integer> age;

    public PersonJava(final String name, final Optional<Integer> age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Optional<Integer> getAge() {
        return age;
    }

    public void setAge(final Optional<Integer> age) {
        this.age = age;
    }
}

class CarJava {
    public PersonJava getDriver() {
        return driver;
    }

    public CarJava(final PersonJava driver) {
        this.driver = driver;
    }

    public void setDriver(final PersonJava driver) {
        this.driver = driver;
    }

    private PersonJava driver;

}

class Util {
    public static Optional<CarJava> getNextCarIfPresentJava() {
//        int i = new Random(20).nextInt();
        int i = 20;
        if (i > 10) {
            return Optional.empty();
        } else {
            return Optional.of(new CarJava(new PersonJava("Lintao", Optional.empty())));
        }
    }
}
