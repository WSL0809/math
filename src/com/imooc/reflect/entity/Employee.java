package com.imooc.reflect.entity;

public class Employee {
    private Integer eno;
    private String ename;
    private Float salary;
    private String dname;
    static {
        System.out.println("Employee has loaded to JVM");
    }

    public Employee(){
        System.out.println("mo_ren");

    }
    public Employee(Integer eno,String ename,Float salary,String dname){
        this.eno = eno;
        this.dname = dname;
        this.ename = ename;
        this.salary = salary;
        System.out.println("dai-can-gou-zao");
    }
    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", dname='" + dname + '\'' +
                '}';
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

}
