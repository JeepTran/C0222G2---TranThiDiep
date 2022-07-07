package com.jeep.furama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @GetMapping
    public ModelAndView displayServiceList(){
        ModelAndView modelAndView = new ModelAndView("service/service-list");
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView displayCreateServiceForm(){
        ModelAndView modelAndView = new ModelAndView("service/service-create");
        return modelAndView;
    }
    @GetMapping("/edit")
    public ModelAndView displayEditServiceForm(){
        ModelAndView modelAndView = new ModelAndView("service/service-edit");
        return modelAndView;
    }
}
