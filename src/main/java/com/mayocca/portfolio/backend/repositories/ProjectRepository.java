package com.mayocca.portfolio.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayocca.portfolio.backend.models.ProjectModel;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectModel, Long> {

}
