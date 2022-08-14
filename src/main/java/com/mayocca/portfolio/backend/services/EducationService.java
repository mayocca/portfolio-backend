package com.mayocca.portfolio.backend.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayocca.portfolio.backend.models.EducationModel;
import com.mayocca.portfolio.backend.repositories.EducationRepository;

@Service
public class EducationService {

    @Autowired
    private EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public ArrayList<EducationModel> getAllEducations() {
        return (ArrayList<EducationModel>) educationRepository.findAll();
    }

    public EducationModel addEducation(EducationModel education) {
        return educationRepository.save(education);
    }

}
