package com.yte.ActivityManagement.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {


    public String login(){
        return "login";

    }
}
