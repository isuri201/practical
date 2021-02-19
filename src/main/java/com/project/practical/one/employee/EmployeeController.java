package com.project.practical.one.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    @GetMapping("employee/form")
    public String form(Model model){
        model.addAttribute("person",employeeDb);
        return "employee/addEmployee";
    }
List<Employee> employeeDb =  new ArrayList<>();
    @PostMapping("/employee")
    public String employeeCheck(@ModelAttribute Employee employee){
employeeDb.add(employee) ;
        System.out.println(employee.toString());
return "redirect:employee/form";
    }

}
