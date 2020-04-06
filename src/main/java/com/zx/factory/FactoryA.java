package com.zx.factory;

import com.zx.pojo.People;
import com.zx.pojo.Student;
import com.zx.pojo.Teacher;

public class FactoryA {
    public People getInstance(String param){
        if("stu".equals(param)){
            return new Student();
        }else if ("tea".equals(param)){
            return new Teacher();
        }else{
            return null;
        }
    }
}
