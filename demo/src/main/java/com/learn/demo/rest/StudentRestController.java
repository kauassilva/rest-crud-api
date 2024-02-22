package com.learn.demo.rest;

import com.learn.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    // Define endpoint for "/students"  - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Frank", "Saint"));
        theStudents.add(new Student("Yehezkel", "Raz"));
        theStudents.add(new Student("Mary", "Smith"));

        return theStudents;
    }

}
