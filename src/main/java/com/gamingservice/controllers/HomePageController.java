package com.gamingservice.controllers;

import com.gamingservice.dtos.user.UserAuthDto;
import com.gamingservice.services.user.UserRegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomePageController {

    private UserRegistrationService userRegistrationService;

    private UserAuthDto userAuthDto;

    public HomePageController(UserRegistrationService userRegistrationService, UserAuthDto userAuthDto) {
        this.userRegistrationService = userRegistrationService;
        this.userAuthDto = userAuthDto;
    }


    @GetMapping("/")
    public String welcomePage(Model model) {
        model.addAttribute("userAuthDto", new UserAuthDto());
        return "index";
    }

    @PostMapping("/")
    public String login(@ModelAttribute UserAuthDto userAuthDto, BindingResult result){
        return "main_menu";
    }


}
