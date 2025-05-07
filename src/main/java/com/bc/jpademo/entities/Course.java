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

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "professor_id")
  private Professor professor;

  @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER)
  @ToString.Exclude
  private Set<Student> students = new HashSet<>();
}
