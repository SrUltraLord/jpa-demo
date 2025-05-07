package com.bc.jpademo.repositories;

import com.bc.jpademo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
  // Todo 4

  // Todo 6
}
