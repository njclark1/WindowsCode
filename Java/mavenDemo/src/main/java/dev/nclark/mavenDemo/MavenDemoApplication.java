package dev.nclark.mavenDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MavenDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PersonRepository personRepository) {
		return args -> {
			Person nick = new Person(1,"Nick", "Clark", null);
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
}
