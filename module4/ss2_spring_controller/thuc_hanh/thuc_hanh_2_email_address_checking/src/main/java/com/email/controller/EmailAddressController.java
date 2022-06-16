package com.email.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailAddressController {
    private final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$";
    public EmailAddressController(){
    }
    @GetMapping("")
    String getIndex(){
        return "index";
    }

    @PostMapping("validate")
    String validateEmail (@RequestParam("email") String email, Model model){
        boolean isValid = this.validate(email);
        if(!isValid){
            model.addAttribute("message","Email is invalid!");
            return "index";
        }
        model.addAttribute("email",email);
        return "success";
    }

    private boolean validate(String email) {
        return email.matches(EMAIL_REGEX);
    }


}
