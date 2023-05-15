package com.bankapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "home")
    public String home(){
        return "home ";
    }

    @GetMapping(path = "mgr")
    public String mgr(){
        return "mgr ";
    }

    @GetMapping(path = "clerk")
    public String clerk(){
        return "clerk ";
    }


}
