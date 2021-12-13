package com.company;

import java.io.Console;

public class Main {


    public static void main(String[] args) {

        System.out.println("\nHello World");
        System.out.println("Time to brush up on Java\n");

        Person Nick = new Person("Nick", "male", 27, 159, "competitive", true);
        Person Elizabeth = new Person("Elizabeth", "female", 27, 168, "goofy", false);
        Computer NicksPC = new Computer("Purple People Eater", Nick.name, "R9 5900x", "6700xt", "x570", "am4", 64, 3600);
        Computer EsPC = new Computer("Hello Kitty", Elizabeth.name, "R7 3700x", "5700xt", "b450", "am4", 32, 3000);
        Nick.introduceSelf();
        Elizabeth.introduceSelf();
        NicksPC.printSpecs();
        EsPC.printSpecs();
    }
}
