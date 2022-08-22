package com.mayocca.portfolio.backend.models;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "projects")
public class ProjectModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private Calendar date;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    public ProjectModel() {
    }

    public ProjectModel(Long id, Calendar date, String name, String description) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}