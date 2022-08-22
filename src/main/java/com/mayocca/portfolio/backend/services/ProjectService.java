package com.mayocca.portfolio.backend.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayocca.portfolio.backend.models.ProjectModel;
import com.mayocca.portfolio.backend.repositories.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public ArrayList<ProjectModel> getAllEducations() {
        return (ArrayList<ProjectModel>) projectRepository.findAll();
    }

    public ProjectModel addEducation(ProjectModel project) {
        return projectRepository.save(project);
    }

}
