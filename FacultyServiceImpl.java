package com.collegedirectory.service.impl;

import com.collegedirectory.model.Faculty;
import com.collegedirectory.model.Student;
import com.collegedirectory.repository.FacultyRepository;
import com.collegedirectory.repository.StudentRepository;
import com.collegedirectory.service.FacultyService;

import java.util.List;

public class FacultyServiceImpl implements FacultyService {

    private FacultyRepository facultyRepository;
    private StudentRepository studentRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository, StudentRepository studentRepository) {
        this.facultyRepository = facultyRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void updateFacultyProfile(Faculty faculty) {
        facultyRepository.save(faculty);
    }

    @Override
    public List<Student> getClassList(int facultyId) {
        return studentRepository.findByFacultyId(facultyId);
    }
}
