package com.example.demo_spring_Boot_demo.controller;

import com.example.demo_spring_Boot_demo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
    public class StudentController {
   @RequestMapping("/student")
    public ArrayList<Student> studentList(){
        ArrayList<Student>students=new ArrayList<>();
        Student student=new Student("Rahul",23,"cs");
        Student student1=new Student("Ramesh",33,"it");
        Student student2=new Student("Raj",32,"cs");
        students.add(student);
        students.add(student1);
        students.add(student2);
        return students;
    }
}
