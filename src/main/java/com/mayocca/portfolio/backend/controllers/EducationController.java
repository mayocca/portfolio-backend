package com.mayocca.portfolio.backend.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mayocca.portfolio.backend.models.EducationModel;
import com.mayocca.portfolio.backend.repositories.EducationRepository;

@RestController
@RequestMapping("/educations")
public class EducationController {

    @Autowired
    private final EducationRepository educationRepository;

    public EducationController(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    @GetMapping(path = "/")
    public ArrayList<EducationModel> getAllEducations() {
        return (ArrayList<EducationModel>) educationRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<EducationModel> getEducation(@PathVariable Long id) {
        return educationRepository.findById(id);
    }

    @PostMapping(path = "/")
    public EducationModel addEducation(@RequestBody EducationModel education) {
        return educationRepository.save(education);
    }

    @PutMapping(path = "/{id}")
    public EducationModel updateEducation(@PathVariable Long id, @RequestBody EducationModel education) {
        education.setId(id);
        return educationRepository.save(education);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteEducation(@PathVariable Long id) {
        educationRepository.deleteById(id);
    }
}
