package com.bc.jpademo.repositories;

import com.bc.jpademo.entities.Course;
import com.bc.jpademo.entities.CourseProjection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
  List<Course> findByProfessorName(String professorName);

  @Query("SELECT c.title AS title, SIZE(c.students) AS total FROM Course c")
  List<CourseProjection> findCourseTotals();
}
