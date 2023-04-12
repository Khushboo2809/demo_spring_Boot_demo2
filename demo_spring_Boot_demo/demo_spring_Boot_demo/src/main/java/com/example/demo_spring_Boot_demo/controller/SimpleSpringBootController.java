package com.example.demo_spring_Boot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class SimpleSpringBootController {
    @RequestMapping("/message")
    public void add(){
        System.out.println("hello spring boot");
    }
    @RequestMapping("/add")
    public String hello(){
        return "this is Spring boot";
    }

    @RequestMapping("/scanner")
    public String scanner(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("my scanner class ");

        String message=scanner.nextLine();
        return message;
    }
}
