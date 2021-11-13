package com.codecool.oop;

public class Main {
    public static void main(String args[]) {
        Animal goat = new Goat();
        Animal cat = new Cat();
        cat.numberOfLegs = 100;
        cat.sayWhoIam();
        goat.numberOfLegs = 4;
        goat.sayWhoIam();
    }
}
