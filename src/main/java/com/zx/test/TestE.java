package com.zx.test;

import com.zx.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestE {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
        Student stu4 = (Student) app.getBean("stu4");
        System.out.println(stu4);
    }
}
