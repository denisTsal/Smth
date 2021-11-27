package by.itoverone.entity;

import java.util.Objects;

public class Teacher {
    private int id;
    private String name;
    private String sub;
    private int salary;

    public Teacher(String sub) {
        this.sub = sub;
    }

    public Teacher(int salary) {
        this.salary = salary;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


    }


