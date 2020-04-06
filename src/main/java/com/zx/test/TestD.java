package com.zx.test;

import com.zx.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestD {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
        Student stu = app.getBean("stu3", Student.class);
        System.out.println(stu);
    }
}
