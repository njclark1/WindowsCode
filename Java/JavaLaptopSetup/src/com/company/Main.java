package com.company;

public class Main {


    public static void main(String[] args) {

        System.out.println("\nHello World");
        System.out.println("Time to brush up on Java\n");

        Person Nick = new Person("Nick", "male", 27, 159, "competitive", true);
        Person Elizabeth = new Person("Elizabeth", "female", 27, 168, "goofy", false);
        Nick.introduceSelf();
        Nick.sitDown();
        Nick.standUp();
        Elizabeth.introduceSelf();
    }
}
