package com.collegedirectory.service.impl;

import com.collegedirectory.model.Administrator;
import com.collegedirectory.repository.AdministratorRepository;
import com.collegedirectory.service.AdministratorService;

public class AdministratorServiceImpl implements AdministratorService {

    private AdministratorRepository administratorRepository;

    public AdministratorServiceImpl(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }

    @Override
    public void manageStudent(Student student) {
        // Implement logic to manage student
    }

    @Override
    public void manageFaculty(Faculty faculty) {
        // Implement logic to manage faculty
    }
}
