package com.jeep.furama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/facility")
public class FacilityController {

    @GetMapping
    public ModelAndView displayFacilityList(){
        ModelAndView modelAndView = new ModelAndView("facility/facility-list");
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView displayCreateFacilityForm(){
        ModelAndView modelAndView = new ModelAndView("facility/facility-create");
        return modelAndView;
    }
    @GetMapping("/edit")
    public ModelAndView displayEditFacilityForm(){
        ModelAndView modelAndView = new ModelAndView("facility/facility-edit");
        return modelAndView;
    }
}
