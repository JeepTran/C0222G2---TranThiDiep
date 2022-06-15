package com.currency.controller;

import com.currency.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyExchangeController {
    @Autowired
    private ICurrencyService iCurrencyService;

    @GetMapping("/currency")
    public String show(){
        return "currency";
    }

        @GetMapping(value = "/exchange")
    public String exchange(@RequestParam double usd, @RequestParam double rate, Model model) {
        double vnd = this.iCurrencyService.exchange(usd,rate);
        model.addAttribute("vnd", vnd);
        return "currency";
    }
}
