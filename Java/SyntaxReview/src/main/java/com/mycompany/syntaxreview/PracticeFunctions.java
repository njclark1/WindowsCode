/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.syntaxreview;

/**
 *
 * @author Nick
 */
public class PracticeFunctions {
    
    public static int addMe(int x, int y) {
        
        int z = x + y;
        return z;
    }
    
    public static void fizzBuzz(int length) {
        for (int i = 1; i < length; i++) {
            //test if divisible by 3 and 5
            if(((i % 3) == 0) && ((i % 5) == 0))
            System.out.println("FizzBuzz");
            //test if divisible by 3
            else if ((i % 3) == 0) 
            System.out.println("Fizz");
            //test if divisible by 5
            else if ((i % 5) == 0)
            System.out.println("Buzz");
            //if neither
            else
                System.out.println(i);
        }
    }
}
