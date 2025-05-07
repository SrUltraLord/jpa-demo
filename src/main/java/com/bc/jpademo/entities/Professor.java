package com.bc.jpademo.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
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

  @OneToMany(fetch = FetchType.EAGER)
  @JoinColumn(name = "professor_id")
  private Set<Course> courses = new HashSet<>();
}
