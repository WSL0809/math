package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class,
                    String.class,
                    Float.class,
                    String.class
            });
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100,"wsl",300f,"aa"
            });
            System.out.println(employee);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
