package com.yte.ActivityManagement.web;

import com.yte.ActivityManagement.service.UserService;
import com.yte.ActivityManagement.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
public class UserRegistrationController {


    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("users")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();

    }

    @PostMapping
    public String RegisterUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){

        userService.save(registrationDto);
        return "redirect:/registration?success";

    }

    @GetMapping
    public  String showRegistrationForm(){

        return "registration";
    }
}
