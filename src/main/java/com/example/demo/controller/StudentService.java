package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();  // fetch all students from database
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public void deleteStudent(int id) {
        repository.deleteById(id);
    }

    public Student updateStudent(int id, Student updatedStudent) {
        if (repository.existsById(id)) {
            updatedStudent.setId(id);
            return repository.save(updatedStudent);
        }
        return null;
    }
}
