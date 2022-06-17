package com.jeep.controller;

import com.jeep.model.Login;
import com.jeep.model.User;
import com.jeep.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private IUserRepository userRepository;

    @GetMapping("home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home", "login", new Login());
        return modelAndView;
    }

    @PostMapping("login")
    public ModelAndView login(@ModelAttribute Login login) {
        User user = this.userRepository.checkLogin(login);
        if (user == null) {
            ModelAndView modelAndView = new ModelAndView("home", "error", "Incorrect account or incorrect password!");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("welcome");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}
