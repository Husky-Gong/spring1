package com.zx.test;

import com.zx.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestF {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
        Student stu5 = app.getBean("stu5", Student.class);
        System.out.println(stu5);
    }
}
