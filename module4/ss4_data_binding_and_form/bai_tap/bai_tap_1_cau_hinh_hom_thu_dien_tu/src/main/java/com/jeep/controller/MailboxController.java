package com.jeep.controller;

import com.jeep.model.Mailbox;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailboxController {

    @GetMapping("/settings")
    public ModelAndView settingPage() {
        ModelAndView modelAndView = new ModelAndView("settings", "mailbox", new Mailbox());
        String[] languages = {"English", "Vietnamese", "Japanese", "Chinese"};
        int[] pageSizes = {5, 10, 15, 25, 50, 100};
        modelAndView.addObject("languages", languages);
        modelAndView.addObject("pageSizes", pageSizes);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute Mailbox mailbox) {
        ModelAndView modelAndView = new ModelAndView("updated", "mailbox", mailbox);
        modelAndView.addObject("message", "Update successfully!");
        return modelAndView;
    }
}
