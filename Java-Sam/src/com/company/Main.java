package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Kofi", "1", List.of(1.0, 2.0, 3.0, 4.0, 5.0));
        System.out.println(s1.getAverageGrade());

        List<Student> allStudents = List.of(
                new Student("Kofi", "1", List.of(1.0, 2.0, 3.0, 4.0, 5.0)),
                new Student("Ama", "2", List.of(5.0, 5.0, 5.0, 4.0, 1.0)),
                new Student("Lee", "3", List.of(5.0, 10.0, 5.0, 5.0, 5.0)),
                new Student("Nimo", "3", List.of(5.0, 5.0, 5.0, 5.0, 5.0))
        );
        
        Lecturer l1 = new Lecturer("Hector");
        
        allStudents.stream().forEach(l1::Enter);


        System.out.println(l1.getHighestAverageGrade());

    }

}
