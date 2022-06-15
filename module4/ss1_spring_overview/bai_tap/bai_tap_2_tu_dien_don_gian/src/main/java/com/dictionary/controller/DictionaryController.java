package com.dictionary.controller;

import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService iDictionaryService;

    @GetMapping(value = "/dictionary")
    public String display() {
        return "dictionary";
    }

    @GetMapping(value = "/translate")
    public String translate(@RequestParam String english, Model model) {
        String vietnamese = this.iDictionaryService.translate(english);
        model.addAttribute("vietnamese", vietnamese);
        model.addAttribute("english", english);
        return "dictionary";
    }
}
