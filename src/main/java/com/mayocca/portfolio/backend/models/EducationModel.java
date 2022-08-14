package com.mayocca.portfolio.backend.models;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "educations")
public class EducationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "institution", nullable = false)
    private String institution;

    @Column(name = "course", nullable = false)
    private String course;

    @Column(name = "start_date", nullable = false)
    private Calendar startDate;

    @Column(name = "end_date")
    private Calendar endDate;

    @Column(name = "description")
    private String description;

    public EducationModel() {
    }

    public EducationModel(Long id, String institution, String course, Calendar startDate, Calendar endDate,
            String description) {
        this.id = id;
        this.institution = institution;
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
