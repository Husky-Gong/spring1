package com.zx.test;

import com.zx.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestB {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Student stu2 = (Student) app.getBean("stu2");
    }
}
