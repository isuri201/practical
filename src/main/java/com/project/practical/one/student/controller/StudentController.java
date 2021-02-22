package com.project.practical.one.student.controller;

import com.project.practical.one.student.entity.Student;
import com.project.practical.one.student.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/student")

public class StudentController {
    private final StudentService studentService;
    public StudentController (StudentService studentService){this.studentService = studentService;}// me  tika danaganna oni sirgen

    @GetMapping("/add")
public String addForm(Model model) {
        model.addAttribute("stu", new Student());
    return "student/addStudent";
    }
    @GetMapping
    public String findAll(Model model){
        model.addAttribute("students",studentService.findAll());
        return "student/student";
    }
    @PostMapping
    public String persist(@ModelAttribute Student student){
        studentService.persist(student);
        return"redirect:student";
    }
    //have to resolve
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id,Model model){// this part should ask sir
        model.addAttribute("stu",studentService.findById(id));
        return"student/addStudent";
    }
    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Integer id, Model model){
        model.addAttribute("stu",studentService.findById(id));
        return "student/studentDetails";

    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){//model model danne natte ai
        studentService.deleteById(id);
        return "student/student";
    }



}
