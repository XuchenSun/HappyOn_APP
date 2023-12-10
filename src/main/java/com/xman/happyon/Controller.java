package com.xman.happyon;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/test")
public class Controller {
    @GetMapping
    public String getResult(){
        return "test";
    }
}

