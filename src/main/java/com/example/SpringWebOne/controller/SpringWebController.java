package com.example.SpringWebOne.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.Map;

@RestController
public class SpringWebController {

    @GetMapping("test")
    public String getTest(){
        return "<h1> Test Page </h1>";
    }
    @PostMapping("testPost")
    public  String getPostTest(@RequestParam(name = "jwk") String jwk){
        System.out.println("Value of jwk "+ jwk);
        return "Got success";
    }
    @GetMapping("/")
    public String getWebPage(){
        return "<h1> This is welcome page </h1>";
    }
}
