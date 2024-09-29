package com.college.service;

import com.college.exception.UserNotFoundException;
import com.college.model.Student;
import com.college.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentProfile(int studentId) throws UserNotFoundException {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new UserNotFoundException("Student not found"));
    }

    public List<Student> searchStudents(String query) {
        return studentRepository.findByNameContaining(query);
    }

    public List<Faculty> getFacultyAdvisors(int studentId) throws UserNotFoundException {
        Student student = getStudentProfile(studentId);
        return student.getFacultyAdvisors();
    }
}
