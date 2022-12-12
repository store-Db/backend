package tn.test.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import tn.test.spring.Controllers.ReglementController;
import tn.test.spring.Repository.FactureRepositrory;
import tn.test.spring.Repository.ReglementRepositrory;

@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(FactureRepositrory factureRepositrory  ) {
        return args -> {

            factureRepositrory.findAll().forEach(System.out::println);
        };
    }

}
