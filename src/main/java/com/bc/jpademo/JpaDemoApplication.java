package com.bc.jpademo;

import com.bc.jpademo.repositories.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class JpaDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(JpaDemoApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(StudentRepository studentRepository) {
    return args -> {
      var students = studentRepository.findAll();
      students.forEach(student -> log.info("Student: {}", student));
    };
  }
}
