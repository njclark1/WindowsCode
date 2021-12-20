package com.company;

public class Main {

    public static void main(String[] args) {
        boolean test = test1(1, 1);
        System.out.println(test);
    }

    //test 1 done!
    public static boolean test1(int num1, int num2) {
        boolean answer;
        if (num1 == num2) {
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }

    //test2 done!
    public static int test2(int base, int height) {
        int answer = 0;
        answer = (base * height) / 2;
        return answer;
    }


}
