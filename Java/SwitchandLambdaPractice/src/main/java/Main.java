import beans.Cat;
import util.Lambda;
import util.Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

//        Switch.switchStatement();
//        Lambda.LambdaExample();
        Cat luna = new Cat();
        System.out.println(luna.getYell());
    }
}
