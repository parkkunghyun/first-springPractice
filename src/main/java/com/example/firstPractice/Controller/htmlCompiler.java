package com.example.firstPractice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class htmlCompiler {
    @GetMapping("/hiPractice")
    public String hiPractice(Model model){
        model.addAttribute("hi", "park");
        return "hiPractice";
    }



}
