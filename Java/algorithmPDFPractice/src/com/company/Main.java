package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int numberArray[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String myString = "hello There";
        fizzBuzz(numberArray);
        reverseString(myString);
    }

    public static void fizzBuzz(int[] s) {
        ArrayList<String> answer = new ArrayList<String>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] % 3 == 0 && s[i] % 5 == 0) {
                answer.add("fizz buzz");
            }
            else if (s[i] % 3 == 0) {
                answer.add("fizz");
            }
            else if (s[i] % 5 == 0) {
                answer.add("buzz");
            }
        }
        System.out.println(answer);
    }

    public static void reverseString(String s) {
        String newString = "";
        char myChar;
        for (int i = 0; i < s.length(); i++) {
            myChar = s.charAt(i);
            newString = myChar + newString;
        }
        System.out.println(newString);
    }
}
