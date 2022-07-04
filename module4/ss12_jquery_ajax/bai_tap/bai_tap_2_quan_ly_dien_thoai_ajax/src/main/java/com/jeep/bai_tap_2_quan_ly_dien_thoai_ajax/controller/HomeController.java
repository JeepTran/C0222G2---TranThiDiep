package com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }
}
