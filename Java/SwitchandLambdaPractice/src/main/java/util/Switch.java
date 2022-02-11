package util;

import java.util.Scanner;

public class Switch {

    public static void switchStatement() {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name) {
            case "Caleb":
                System.out.println("Hello, Caleb");
                break;
            case "Clare":
                System.out.println("Hello, Clare");
                break;
            default:
                System.out.println("I don't know you");
                break;
        }
    }
}
