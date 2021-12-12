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
    Person(String n, String g, int a, int w, String p, boolean i){
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
            System.out.println(this.name + " is now standing");
        } else {
            System.out.println(this.name + " is already standing");
        }
    }//end standup

    //function to sit a person down
    void sitDown() {
        if (isSitting == false) {
            isSitting = true;
            System.out.println(this.name + " is now sitting");
        } else {
            System.out.println(this.name + " is already sitting");
        }
    }//end sitdown


    //function to introduce a person
    public void introduceSelf() {
        String sittingDialogue;
        if (isSitting == true) {
            sittingDialogue = "I am currently sitting down.";
        } else {
            sittingDialogue = "I am currently standing up.";
        }
        System.out.println("Hi, my name is " + name + ". I am a " + age + " year old " + gender +
                ".\nI currently weigh " + weight + "lbs." +
                "\nMy personality is " + personality + ", and " + sittingDialogue);
    }
}
