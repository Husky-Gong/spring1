package com.zx.test;

import com.zx.pojo.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

    public static void main(String[] args) {
        //1. 解析applicationContext文件
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Student stu = app.getBean("stu", Student.class);
        System.out.println(stu);
    }
}
