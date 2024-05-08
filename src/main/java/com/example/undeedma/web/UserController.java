package com.example.undeedma.web;

import com.example.undeedma.services.User.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    UserManager userManager;

    @GetMapping("")
    public String start()
    {
        return "redirect:indexpage";
    }
    @GetMapping( "/register")
    public String register()
    {
        return "register";
    }
}
