package com.example.jwt_intro.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/v1/blog")
public class BlogController {
    @CrossOrigin
    @GetMapping("/newMethod")
    //@PreAuthorize()
    public String newMethod(){
        return "HI";
    }
}