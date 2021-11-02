package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> allStudents = List.of(
                new Student("Luigi", "11", Year.FIRST),
                new Student("Betty", "12", Year.FIRST),
                new Student("Theo", "13", Year.FIRST),
                new Student("Salamanca", "14", Year.FIRST),
                new Student("Faye", "15", Year.FIRST),
                new Student("Yoshi", "21", Year.SECOND),
                new Student("Maria", "22", Year.SECOND),
                new Student("Adele", "23", Year.SECOND),
                new Student("Lee", "24", Year.SECOND),
                new Student("Joe", "25", Year.SECOND),
                new Student("Rosalina", "31", Year.THIRD),
                new Student("Homie", "32", Year.THIRD),
                new Student("Bodie", "33", Year.THIRD),
                new Student("Sarah", "34", Year.THIRD),
                new Student("Pooth", "35", Year.THIRD),
                new Student("Wario", "41", Year.FOURTH),
                new Student("Grace", "42", Year.FOURTH),
                new Student("Valentine", "43", Year.FOURTH),
                new Student("Spike", "44", Year.FOURTH),
                new Student("Paul", "45", Year.FOURTH)

        );

//        lecturers
        Lecturer l1 = new Lecturer("Gustavo", Courses.ENGLISH_LANGUAGE);
        Lecturer l2 = new Lecturer("Hector", Courses.PHYSICS);
        Lecturer l3 = new Lecturer("Penguin", Courses.GARDENING);
        Lecturer l4 = new Lecturer("Gustavo", Courses.MATHS);
        Lecturer l5 = new Lecturer("Calmine", Courses.PROGRAMMING);

//        courses
//        intro to programming course
        List<Student> programmingStudents = new ArrayList<>();
        allStudents.stream().filter(student -> student.getYear() == Year.FIRST).forEach(programmingStudents::add);

        Course introToProgramming = new Course(Courses.PROGRAMMING, l5, programmingStudents, Year.FIRST);

//        advanced gardening class
        List<Student> advancedGardeningStudents = new ArrayList<>();
        allStudents.stream().filter(student -> student.getYear() == Year.THIRD  || student.getYear() == Year.FOURTH).forEach(advancedGardeningStudents::add);

        Course advancedGardening = new Course(Courses.GARDENING, l3, advancedGardeningStudents, Year.FOURTH);

//      physics course
        List<Student> physicsStudents = new ArrayList<>();
        allStudents.stream().filter(student -> student.getYear() == Year.FOURTH  && student.getName().startsWith("A")).forEach(physicsStudents::add);
        Course physics = new Course(Courses.PHYSICS, l2, physicsStudents, Year.FOURTH);

        for (Student student:physicsStudents) {
            System.out.println(student.getName());
        }
    }
}
