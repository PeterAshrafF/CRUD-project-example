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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student henksh = new Student(
                    "henksh",
                    "henksh@bolbol.com",
                    LocalDate.of(2000, Month.DECEMBER, 6)
            );

            Student alex = new Student(
                    "alexandria",
                    "alex@seamen.com",
                    LocalDate.of(2003, Month.DECEMBER, 6)
            );

            repository.saveAll(
                    List.of(henksh, alex)
            );
        };
    }
}
