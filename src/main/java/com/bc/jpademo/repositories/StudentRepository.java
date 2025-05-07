package com.bc.jpademo.repositories;

import com.bc.jpademo.entities.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
  List<Student> findByNameStartingWith(Character initial);

  @Query("SELECT s FROM Student s WHERE s.address.street = :street")
  List<Student> findAllByStreetName(@Param("street") String streetName);
}
