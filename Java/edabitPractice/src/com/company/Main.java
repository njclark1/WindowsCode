package com.company;

public class Main {

    public static void main(String[] args) {
        int test = test5("what on earth is even going on here");
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
        int answer = (base * height) / 2;
        return answer;
    }

    //test3 done!
    public static int test3(int hours) {
        int answer = hours * 3600;
        return answer;
    }

    //test4 done!
    public static int test4(int num) {
        int answer = num + 1;
        return answer;
    }

    //test5 done!
    public static int test5(String s) {
        int answer = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer++;
            }
        }
        return answer;
    }
}
