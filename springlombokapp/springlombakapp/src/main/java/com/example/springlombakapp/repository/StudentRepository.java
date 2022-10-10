package com.example.springlombakapp.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springlombakapp.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Query method
    Optional<Student> findByEmail(String email);
}