package com.example.demo_spring_Boot_demo.model;

public class Student {
    String name;
    int age;
    String stream;

    public Student(String name, int age, String stream) {
        this.name = name;
        this.age = age;
        this.stream = stream;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
