package com.example.teacher.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teacher.entity.Teacher;

@RestController
public class TeacherController {

    @GetMapping("/teachers")
    public List<Teacher> getTeachers() {

        return Arrays.asList(
            new Teacher(1, "Ravi Kumar", "Mathematics"),
            new Teacher(2, "Priya Sharma", "Computer Science"),
            new Teacher(3, "Arun Kumar", "Physics")
        );
    }
}