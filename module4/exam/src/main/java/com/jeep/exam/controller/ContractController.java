package com.jeep.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contract")
public class ContractController {


    @GetMapping
    public ModelAndView displayContractList() {
        ModelAndView modelAndView = new ModelAndView("list-1");
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView displayCreateContractForm() {
        ModelAndView modelAndView = new ModelAndView("create-1");
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView createContract() {
        ModelAndView modelAndView = new ModelAndView("edit-1");

        return modelAndView;
    }
}
