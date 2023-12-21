package com.xman.happyon.service;

import com.xman.happyon.api.model.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamal@email.com",
                        LocalDate.of(2000, Month.APRIL,3),
                        32
                )
        );
    }
}
