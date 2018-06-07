package com.batcodes.springboot.studentservices.model;

import java.util.List;
import java.util.Objects;

public class Course {

    private String id;
    private String name;
    private String description;
    private List<String> steps;

    // Needed by Caused by: com.fasterxml.jackson.databind.JsonMappingException:
    // Can not construct instance of com.in28minutes.springboot.model.Course:
    // no suitable constructor found, can not deserialize from Object value
    // (missing default constructor or creator, or perhaps need to add/enable
    // type information?)
    public Course() {
    }

    public Course(String id, String name, String description, List<String> steps) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.steps = steps;
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

    public List<String> getSteps() {
        return steps;
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

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return String.format(
                "Course [id=%s, name=%s, description=%s, steps=%s]", id, name,
                description, steps);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id) &&
                Objects.equals(name, course.name) &&
                Objects.equals(description, course.description) &&
                Objects.equals(steps, course.steps);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
