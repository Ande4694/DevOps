package com.example.devops.controller;

import net.bytebuddy.asm.Advice;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index(){

        return "index";
    }
}
