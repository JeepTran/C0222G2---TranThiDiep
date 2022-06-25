package com.jeep.bai_tap_1_validate_form.controller;

import com.jeep.bai_tap_1_validate_form.dto.UserDto;
import com.jeep.bai_tap_1_validate_form.model.User;
import com.jeep.bai_tap_1_validate_form.repository.IUserRepository;
import com.jeep.bai_tap_1_validate_form.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/form")
public class FormController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public String listUser(Model model) {
        model.addAttribute("userList", this.userService.findAll());
        return "list";
    }

    @RequestMapping("/create")
    public String displayForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "form";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Valid UserDto userDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new UserDto().validate(userDto,bindingResult);
        if (bindingResult.hasErrors()) {
            return "form";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        this.userService.save(user);
        redirectAttributes.addFlashAttribute("success", "Add new user successfully!");
        return "redirect:/form/list";
    }


}
