package com.company;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
	System.out.println("What is your first name?");
	//type  identifier = new type();
	Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    String nameLower = name.toLowerCase(Locale.ROOT);


    System.out.println("\nHello " + name + ",");
    String relation = "";
    if (nameLower.equals("elizabeth")) {
            relation = "Girlfriend";
        }
    else if (nameLower.equals("nick")) {
        relation = "Brother-in-Law";
    }
    else if (nameLower.equals("glen")) {
        relation = "Father";
    }
    else if (nameLower.equals("sandra")) {
        relation = "Mother";
    }
    else if (nameLower.equals("luna")) {
        relation = "Cat";
    }
    else if (nameLower.equals("nicholas")) {
        relation = "Self";
    }
    else if (nameLower.equals("margaret")) {
        relation = "Sister";
    }
    else {
        relation = "nothing. You don't matter";
    }

    System.out.println("You are Nicholas' " + relation + ". Good for you!");

    String example = new String("\nI was able to remember your name and relation to Nicholas. ");
    System.out.println(example + "Yay, we did it!\n");

    System.out.println("How old are you?: ");
    int age = scanner.nextInt();

    if (age >= 60 && age <= 105){
        System.out.println("\nYou're gonna die soon!\n");
    }
    else if (age >= 28 && age <= 59) {
        System.out.println("\nGetting up there, huh?\n");
        }
    else if (age < 27 && age >= 0){
        System.out.println("\nStill a baby, huh?\n");
    }
    else{
        System.out.println("\nNice try!\n");
    }

    String easier = "Now I'm going to do some math for you.\n";
    System.out.println(easier);

    System.out.println("Please give me a number: ");
    long number = scanner.nextLong();
    long sixnine = 69;
    if (number == sixnine){
        System.out.println("\nNice! Your number is 69, you degenerate!");
    } else if (number == 420){
        System.out.println("\nBlaze it!" + " Your number is " + abs(sixnine - number) + " away from 69... Nice!");
    } else {
        System.out.println("Your number is " + abs(sixnine - number) + " away from 69... Nice!");

    }
    System.out.println("\nThat's all I have for now. Thank you for trying me!");
    }
}
