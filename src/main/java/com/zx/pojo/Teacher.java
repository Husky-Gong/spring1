package com.zx.pojo;

public class Teacher implements People{

    @Override
    public void eat() {
        System.out.println("Teacher is eating");
    }

    @Override
    public void run() {
        System.out.println("Student is running");
    }
}
