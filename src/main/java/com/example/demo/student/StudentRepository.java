package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository // Responsible for data access
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("Select s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
