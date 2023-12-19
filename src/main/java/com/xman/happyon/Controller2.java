package com.xman.happyon;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/api")
public class Controller2 {
    @PostMapping
    public String postResult(){
        return "test";
    }
}

