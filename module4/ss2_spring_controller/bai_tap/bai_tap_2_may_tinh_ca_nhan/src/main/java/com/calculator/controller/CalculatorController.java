package com.calculator.controller;

import com.calculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("")
    public String display() {
        return "index";
    }

    @GetMapping("calculate")
    public String calculate(@RequestParam int number1, @RequestParam int number2,
                            @RequestParam String operator, Model model) {
        String error = "";
        if(number2==0 && operator.equals("divide")){
            error = "Cannot be divided by 0!";
        }
        double result = this.iCalculatorService.doCalculate(number1, number2, operator);

        model.addAttribute("result", result);
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("error",error);
        return "index";
    }
}
