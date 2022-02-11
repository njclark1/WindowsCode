package dev.nclark.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import java.sql.*;
import javax.*;

<<<<<<< Updated upstream
public class Person {

    //properties
    private int id;
    private String firstName;
    private String lastName;

    //getters and setters
    public int getId() {
=======
@Entity
public class Person {

    private long id;
    private String firstName;
    private String lastName;

    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
>>>>>>> Stashed changes
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

<<<<<<< Updated upstream
    //constructor
    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
=======
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
>>>>>>> Stashed changes
    }
}