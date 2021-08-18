package com.manasni.appflowtracker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @RequestMapping("/test")
    public String getRequest(){
        return "Sample request received.";
    }
}
