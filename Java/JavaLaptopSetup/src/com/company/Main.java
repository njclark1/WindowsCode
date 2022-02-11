package com.company;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World\n");
        System.out.println("Time to brush up on Java\n");

        Person Nick = new Person("Nick", "male", 27, 159, "competitive", true);
        Person Elizabeth = new Person("Elizabeth", "female", 27, 168, "goofy", false);
        Computer NicksPC = new Computer("Purple People Eater", Nick.name, "R9 5900x", "6700xt", "x570", "am4", 64, 3600, false);
        Computer EsPC = new Computer("Hello Kitty", Elizabeth.name, "R7 3700x", "5700xt", "b450", "am4", 32, 3000, false);

        interactWithUser(Nick, Elizabeth, NicksPC, EsPC);


        //have Nick introduce themself
        //Nick.introduceSelf();

        //have Elizabeth introduce themself
        //Elizabeth.introduceSelf();

        //print Nick pc specs
        //NicksPC.printSpecs();

        //print E pc specs
        //EsPC.printSpecs();

        //NicksPC.turnComputerOn();
    }

    private static void interactWithUser(Person Nick, Person Elizabeth, Computer NicksPC, Computer EsPC) {
        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Hello, what is your name? ");
        String userName = nameScanner.nextLine();

        if (userName.equals(Nick.name)) {
            Scanner introScanner = new Scanner(System.in);
            System.out.println("Hello " + userName + ", would you like me to introduce you?(yes or no)");
            String introAnswer = introScanner.nextLine();
            if (introAnswer.equals("yes")) {
                Nick.introduceSelf();
            } else {
                System.out.println("Okay, be that way.");
            }
        }
        else if (userName.equals(Elizabeth.name)) {
            Scanner introScanner = new Scanner(System.in);
            System.out.println("Hello " + userName + ", would you like me to introduce you?(yes or no)");
            String introAnswer = introScanner.nextLine();
            if (introAnswer.equals("yes")) {
                Elizabeth.introduceSelf();
            } else {
                System.out.println("Okay, be that way.");
            }
        }
        else {
            System.out.println("I do not recognize you.");
        }
    }
    }

