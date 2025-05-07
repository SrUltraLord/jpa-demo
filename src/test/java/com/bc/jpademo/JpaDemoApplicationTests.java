package com.bc.jpademo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.bc.jpademo.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
class JpaDemoApplicationTests {
  @MockitoBean private StudentRepository studentRepository;

  @Test
  void contextLoads() {
    assertNotNull(studentRepository);
  }
}
