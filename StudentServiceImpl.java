package com.collegedirectory.service.impl;

import com.collegedirectory.model.Student;
import com.collegedirectory.model.Faculty;
import com.collegedirectory.repository.StudentRepository;
import com.collegedirectory.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudentProfile(int studentId) {
        return studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @Override
    public List<Student> searchStudents(String name, String department, String year) {
        return studentRepository.searchByNameDepartmentYear(name, department, year);
    }

    @Override
    public List<Faculty> getFacultyAdvisors(int studentId) {
        return studentRepository.findAdvisorsByStudentId(studentId);
    }
}
