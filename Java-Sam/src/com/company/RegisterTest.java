package com.company;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    Register register;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        List<Nameable> allStudents = List.of(
                new Student("Kofi", "1", List.of(1.0, 2.0, 3.0, 4.0, 5.0)),
                new Student("Ama", "2", List.of(5.0, 5.0, 5.0, 4.0, 1.0)),
                new Student("Lee", "3", List.of(5.0, 10.0, 5.0, 5.0, 5.0)),
                new Student("Nimo", "3", List.of(5.0, 5.0, 5.0, 5.0, 5.0))
        );

        register = new Register(allStudents);
    }

    @org.junit.jupiter.api.Test
    void getRegister() {
        List<String> names = register.getRegister();
        assertEquals("Nimo", names.get(3));
    }
}