package com.company;

import java.util.List;

public class Student {
    private String name;
    private String id;
    List<Double> grades;

    public Student(String name, String id, List<Double> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public double getAverageGrade () {
        return this.grades.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    }

    public String getName() {
        return name;
    }
}
