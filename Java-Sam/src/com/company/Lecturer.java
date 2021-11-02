package com.company;

public class Lecturer {
    private String name;
    private Courses courses;

    public Lecturer(String name, Courses courses) {
        this.name = name;
        this.courses = courses;
    }

    public void setSubjects(Courses courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public Courses getSubjects() {
        return courses;
    }
}
