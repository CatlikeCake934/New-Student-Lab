package com.company;

public class Student {
    private String name;
    public int id;
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String printWelcome(){
        return "Welcome " + getName();
    }
}
