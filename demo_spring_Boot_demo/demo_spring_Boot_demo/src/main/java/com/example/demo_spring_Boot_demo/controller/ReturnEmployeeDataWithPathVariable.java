package com.example.demo_spring_Boot_demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnEmployeeDataWithPathVariable {
    @RequestMapping("/Employee/{name}/{age}/{department}")
    public String Employee(@PathVariable String name, @PathVariable int age,@PathVariable String department){

        return "Employee name is.."+ name + " Age is..."+ age+ "department " + department;
    }

}
