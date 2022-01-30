/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.syntaxreview;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class PracticeFunctions {

    public static void addMe(int x, int y) {
        int z = x + y;
        //print addition result
        System.out.println(z);
    }

    public static void fizzBuzz(int length) {

        int numLines = length + 1;
        
        for (int i = 1; i < numLines; i++) {

            //test if divisible by 3 and 5
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FizzBuzz");
            } //test if divisible by 3
            else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } //test if divisible by 5
            else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } //if neither
            else {
                System.out.println(i);
            }
        }
    }
}
