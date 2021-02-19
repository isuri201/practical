package com.project.practical.one.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class FirstController {
    @GetMapping("/first")
    public String first(Model model){
        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalDate localDate = LocalDate.now();
//        model.addAttribute("day",localDate);
        model.addAttribute("day",localDateTime);
        return "first";
    }

}
