package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lecturer {
    private String name;
    private List<Student> student = new ArrayList<>();

    public Lecturer(String name) {
        this.name = name;
    }

    public void Enter (Student student) {
        this.student.add(student);
    }

    public double getHighestAverageGrade () {
        return this.student.stream().map(Student::getAverageGrade).max(Comparator.comparing(Double::valueOf)).get();
    }

    public List<Student> getStudent() {
        return student;
    }
}
