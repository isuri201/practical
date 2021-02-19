package com.project.practical.one.student.controller;

import com.project.practical.one.student.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/student")

public class StudentController {
    private final StudentService studentService;
    public StudentController (StudentService studentService){this.studentService = studentService;}


}
