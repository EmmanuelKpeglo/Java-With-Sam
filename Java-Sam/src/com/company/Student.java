package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Student implements Nameable{
    private String name;
    private String id;
    List<Double> grades = new ArrayList<Double>();

    public Student(String name, String id, List<Double> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public double getAverageGrade () {
        return this.grades.stream().mapToDouble(grade -> grade).average().getAsDouble();
    }

    @Override
    public String getName() {
        return name;
    }

    public DoubleStream getGrades () {
        return DoubleStream.of();
    }

}
