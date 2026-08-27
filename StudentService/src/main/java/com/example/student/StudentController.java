package com.example.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public String getStudent(
            @RequestParam int id,
            @RequestParam String name) {

        return "Student Details : ID = " + id +
               ", Name = " + name;
    }

}