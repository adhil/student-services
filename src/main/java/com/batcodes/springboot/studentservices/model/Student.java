package com.batcodes.springboot.studentservices.model;

import java.util.List;

public class Student {

    private String id;
    private String name;
    private String description;
    private List<Course> courses;

    public Student(String id, String name, String description,
                   List<Course> courses) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return String.format(
                "Student [id=%s, name=%s, description=%s, courses=%s]", id,
                name, description, courses);
    }
}
