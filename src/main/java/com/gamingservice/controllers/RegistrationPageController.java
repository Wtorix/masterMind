package com.gamingservice.controllers;

import com.gamingservice.dtos.user.UserRegistrationDto;
import com.gamingservice.models.User;
import com.gamingservice.services.user.UserRegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationPageController {

    private UserRegistrationService userRegistrationService;

    public RegistrationPageController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    @GetMapping("/registration_form")
    public String registrationForm(Model model) {
        model.addAttribute("userRegistrationDto", new UserRegistrationDto());
        return "registration_form";
    }

    @PostMapping("/registration_form")
    public String registerUser(@ModelAttribute @Valid UserRegistrationDto userRegistrationDto, BindingResult result,Model model) {
        if (result.hasErrors()) {
            return "registration_form";
        } else {
            model.addAttribute("userRegistrationDto",userRegistrationDto);
            userRegistrationService.register(new User(userRegistrationDto.getLogin()
                    ,userRegistrationDto.getPassword()
                    ,userRegistrationDto.getEmail()));

            return "registered";
        }
    }
}
