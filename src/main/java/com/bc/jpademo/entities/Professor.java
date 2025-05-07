package com.bc.jpademo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "professors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Professor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  // Todo 1
  //  @ToString.Exclude
  //  private Set<Course> courses = new HashSet<>();
}
