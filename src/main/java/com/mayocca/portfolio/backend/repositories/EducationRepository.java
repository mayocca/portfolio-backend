package com.mayocca.portfolio.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayocca.portfolio.backend.models.EducationModel;

@Repository
public interface EducationRepository extends CrudRepository<EducationModel, Long> {

}
