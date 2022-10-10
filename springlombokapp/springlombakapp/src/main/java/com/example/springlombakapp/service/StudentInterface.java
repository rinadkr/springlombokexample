package com.example.springlombakapp.service;

import java.util.List;
import java.util.Optional;

import com.example.springlombakapp.entity.Student;


public interface StudentInterface {
    List<Student> getAllStudents();
    Optional<Student> findById(int id);
    Optional<Student> findByEmail(String email);
    Student save(Student std);
    void deleteById(int id);
}