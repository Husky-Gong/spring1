package com.zx.pojo;

public class Student implements People{
    private String name;
    private String sex;
    private Integer age;
    private School school;

    public Student() {
        System.out.println("调用了无参构造方法1");
    }

    public Student(String name, String sex, Integer age, School school) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("student is eating");
    }

    @Override
    public void run() {
        System.out.println("student is running");
    }
}
