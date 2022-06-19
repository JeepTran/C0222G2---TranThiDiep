package com.jeep.controller;

import com.jeep.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    @GetMapping("/healthDeclaration")
    public String declareView(Model model) {
        model.addAttribute("person",new Person());
        String [] travel = {"Tàu bay","Tàu thuyền","Ô tô", "Khác"};
        model.addAttribute("travel",travel);
        return "home";
    }

    @PostMapping("/declare")
    public String save(@ModelAttribute Person person, Model model) {
        model.addAttribute("person", person);
        return "info";
    }
}
