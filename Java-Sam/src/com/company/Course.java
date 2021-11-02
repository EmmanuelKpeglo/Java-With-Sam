package com.company;

import java.util.List;

public class Course {
    private Courses course;
    private Lecturer lecturer;
    private List<Student> students;
    private Year courseYear;

    public Course(Courses course, Lecturer lecturer, List<Student> students, Year courseYear) {
        this.course = course;
        this.lecturer = lecturer;
        this.students = students;
        this.courseYear = courseYear;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Year getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(Year courseYear) {
        this.courseYear = courseYear;
    }
}
