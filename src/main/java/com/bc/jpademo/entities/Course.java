package com.bc.jpademo.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
import lombok.*;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  // Todo 1
  private Professor professor;

  // Todo 2
  @ToString.Exclude
  private Set<Student> students = new HashSet<>();
}
