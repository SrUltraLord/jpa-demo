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

  @ManyToOne @ToString.Exclude private Professor professor;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
      name = "students_courses",
      joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
  private Set<Student> students = new HashSet<>();
}
