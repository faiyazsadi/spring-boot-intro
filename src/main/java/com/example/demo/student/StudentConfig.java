package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sadi = new Student(
                    "Sadi",
                    "sadi@gmail.com",
                    LocalDate.of(1999, Month.OCTOBER, 8)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1999, Month.OCTOBER, 5)
            );
            repository.saveAll(
                    List.of(sadi, alex)
            );
        };
    }
}
