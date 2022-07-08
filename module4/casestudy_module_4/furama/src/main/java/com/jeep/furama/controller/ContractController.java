package com.jeep.furama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contract")
public class ContractController {

    @GetMapping
    public ModelAndView displayContractList(){
        ModelAndView modelAndView = new ModelAndView("contract/contract-list");
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView displayCreateFacilityForm(){
        ModelAndView modelAndView = new ModelAndView("contract/contract-create");
        return modelAndView;
    }
//    @GetMapping("/edit")
//    public ModelAndView displayEditFacilityForm(){
//        ModelAndView modelAndView = new ModelAndView("contract/contract-edit");
//        return modelAndView;
//    }
}