package com.godcoder.myhome1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//mainController

@Controller
public class HomeController {

    @GetMapping
    public String index(){
        return "index";
    }

}
