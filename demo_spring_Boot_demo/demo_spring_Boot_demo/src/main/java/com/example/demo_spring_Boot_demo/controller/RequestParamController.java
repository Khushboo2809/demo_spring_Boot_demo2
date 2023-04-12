package com.example.demo_spring_Boot_demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    public class PathVariableController {
        @RequestMapping("/addData/{a}/{b}")
        public String add(@PathVariable int a, @PathVariable int b) {
            return "add result is...." + (a + b);
        }

        @RequestMapping("/hello/{age}")
        public String findAge(@PathVariable int age) {
            if (age < 18) {
                return "parson is child";
            } else if (age >= 18 & age < 45) {
                return "parson is young";
            } else {
                return "parson is old";
            }

        }

        @RequestMapping("/data/{name}/{age}/{stream}")
        public String mydata(@PathVariable String name, @PathVariable int age, @PathVariable String stream) {
            return "my data is......" + "name :" + name + " age :" + age + " stream :" + stream;

        }
    }
}
