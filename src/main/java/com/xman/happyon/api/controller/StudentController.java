package com.xman.happyon.api.controller;

import com.xman.happyon.api.model.Student;
import com.xman.happyon.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = new StudentService();
    }

    @GetMapping(value = "v1")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
