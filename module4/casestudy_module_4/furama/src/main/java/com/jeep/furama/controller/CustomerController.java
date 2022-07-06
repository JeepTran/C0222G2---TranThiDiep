package com.jeep.furama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public ModelAndView displayCustomerList(){
        ModelAndView modelAndView = new ModelAndView("customer/customer-list");
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView displayCreateCustomerForm(){
        ModelAndView modelAndView = new ModelAndView("customer/customer-create");
        return modelAndView;
    }
    @GetMapping("/edit")
    public ModelAndView displayEditCustomerForm(){
        ModelAndView modelAndView = new ModelAndView("customer/customer-edit");
        return modelAndView;
    }
}