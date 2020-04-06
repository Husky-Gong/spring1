package com.zx.test;

import com.zx.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestC {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        People people = (People) app.getBean("ppl", People.class);
        people.eat();
    }
}
