package com.example.demo_spring_Boot_demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorWithPathvariable {
    @RequestMapping("/sum/{a}/{b}")
    public String add(@PathVariable int a , @PathVariable int b) {

        //int sum=a+b;
        return "this is my sum .." + (a + b);
    }

    @RequestMapping("/sub/{a}/{b}")
    public String subtraction(@PathVariable int a, @PathVariable int b) {

        //int sum=a-b;
        return "this is my subtraction .." + (a - b);

    }

    @RequestMapping("/mul/{a}/{b}")
    public String multi(@PathVariable int a,@PathVariable int b) {

        //int sum=a*b;
        return "this is my multi .." + (a * b);
    }

    @RequestMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b) {

        //int sub=a/b;
        return "this is my sum .." + (a / b);
    }


}
