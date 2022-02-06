package dev.nclark.HomeManager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class DefaultPeople implements CommandLineRunner {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {

            System.out.println("writing default people to database");
            Person nick = new Person(1, "Nick", "Clark", null);
            Person Elizabeth = new Person(
                    2,
                    "Elizabeth",
                    "Beattie",
                    "Super Hot Girlfriend"
            );
            Person Jacob = new Person(
                    3,
                    "Jacob",
                    "Sides",
                    "Super Special Awesome"
            );

            personRepository.save(nick);
            personRepository.save(Elizabeth);
            personRepository.save(Jacob);

        };
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("default people");
    }
}
