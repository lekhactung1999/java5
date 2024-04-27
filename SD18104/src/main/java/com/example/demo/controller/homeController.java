package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class homeController {

    @GetMapping("home")
    public String Home(){

        return "trang_chu/index";

    }

}
