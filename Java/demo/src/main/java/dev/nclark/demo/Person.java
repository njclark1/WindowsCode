package dev.nclark.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;


public class Person {
    int id;
    String firstName;
    String lastName;

    public static void printHi () {
        System.out.println("Hi");
    }

}