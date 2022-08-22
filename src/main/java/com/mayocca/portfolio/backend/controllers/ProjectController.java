package com.mayocca.portfolio.backend.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mayocca.portfolio.backend.models.ProjectModel;
import com.mayocca.portfolio.backend.repositories.ProjectRepository;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private final ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping(path = "/")
    public ArrayList<ProjectModel> getAllProjects() {
        return (ArrayList<ProjectModel>) projectRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<ProjectModel> getProject(@PathVariable Long id) {
        return projectRepository.findById(id);
    }

    @PostMapping(path = "/")
    public ProjectModel addProject(@RequestBody ProjectModel project) {
        return projectRepository.save(project);
    }

    @PutMapping(path = "/{id}")
    public ProjectModel updateProject(@PathVariable Long id, @RequestBody ProjectModel project) {
        project.setId(id);
        return projectRepository.save(project);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectRepository.deleteById(id);
    }
}
