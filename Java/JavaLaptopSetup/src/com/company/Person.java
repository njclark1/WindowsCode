package com.company;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class Person {
    //attributes of a person
    String name;
    String gender;
    String personality;
    int age;
    int weight;
    boolean isSitting;

    //full person constructor
    Person(String n, String g, int a, int w, String p, boolean i) {
        this.name = n;
        this.gender = g;
        this.age = a;
        this.weight = w;
        this.personality = p;
        this.isSitting = i;
    }

    //function to stand a person up
    void standUp() {
        if (isSitting == true) {
            isSitting = false;
            System.out.println(this.name + " is now standing\n");
        } else {
            System.out.println(this.name + " is already standing\n");
        }
    }//end standup

    //function to sit a person down
    void sitDown() {
        if (isSitting == false) {
            isSitting = true;
            System.out.println(this.name + " is now sitting\n");
        } else {
            System.out.println(this.name + " is already sitting\n");
        }
    }//end sitdown


    //function to introduce a person
    public void introduceSelf() {
        String sittingDialogue;
        if (isSitting == true) {
            sittingDialogue = "You are currently sitting down.\n";
        } else {
            sittingDialogue = "You are currently standing up.\n";
        }
        System.out.println("Hi, your name is " + name + ". You are a " + age + " year old " + gender +
                ".\n\nI currently weigh " + weight + "lbs.\n" +
                "\nYour personality is " + personality + ", and " + sittingDialogue);
    }
}
class Room extends Computer {
    Room(String n, String o, String c, String g, String mc, String ms, int rq, int rs, boolean io) {
        super(n, o, c, g, mc, ms, rq, rs, io);
    }

    void what () {
        System.out.println("Hi");
    }

}
