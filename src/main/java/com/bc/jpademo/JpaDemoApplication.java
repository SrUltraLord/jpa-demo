package com.bc.jpademo;

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

  // 💉 You can inject dependencies here!
  @Bean
  CommandLineRunner runner() {
    return args -> {
      // 💡 You can try your repositories here!
    };
  }
}
