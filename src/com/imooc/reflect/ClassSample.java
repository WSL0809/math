package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

public class ClassSample {
    public static void main(String[] args) {
        try {
            //Class.forName()方法将指定的类加载到JVM，并返回Class对象
            Class empolyeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            //newInstance通过默认的构造方法创建新的对象
            Employee emp = (Employee)empolyeeClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
