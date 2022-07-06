package com.jeep.furama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping
    public ModelAndView displayEmployeeList(){
        ModelAndView modelAndView = new ModelAndView("employee/employee-list");
        return modelAndView;
    }
//    @GetMapping("/create")
//    public ModelAndView displayCreateEmployeeForm(){
//        ModelAndView modelAndView = new ModelAndView("employee/employee-create");
//        return modelAndView;
//    }
//    @GetMapping("/edit")
//    public ModelAndView displayEditEmployeeForm(){
//        ModelAndView modelAndView = new ModelAndView("employee/employee-edit");
//        return modelAndView;
//    }
}