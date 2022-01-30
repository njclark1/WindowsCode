/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.syntaxreview;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author Nick
 */
public class Main {
    public static void main(String[] args) {
        
        //open frame
        MyFrame.mainFrame();
        
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //ask user for number 1
        System.out.println("What is the first number you would like to add?");
        int num1 = scan.nextInt();
        
        //ask user for number 2
        System.out.println("What is the second number you would like to add");
        int num2 = scan.nextInt();
        
        //run addition function
        int addedNumbers = 0;
        addedNumbers = PracticeFunctions.addMe(num1, num2);
        
        //print addition result
        System.out.println(addedNumbers);
        
        //run fizzbuzz function        
        //ask user for number 1
        System.out.println("How many numbers would you like to scan?");
        int fizzBuzzRange = scan.nextInt() + 1;
        PracticeFunctions.fizzBuzz(fizzBuzzRange);
        
        //close scanner
        scan.close();
    }
    
}
