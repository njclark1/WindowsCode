package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileread {
    public static void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("myText.txt"));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
