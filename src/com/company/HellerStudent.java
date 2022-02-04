package com.company;

public class HellerStudent extends Student{
    private String homeSchool;
    public HellerStudent(String name, String homeSchool, int id){
        super(name,id);
        this.homeSchool = homeSchool;
    }
    public String getHomeSchool(){
        return homeSchool;
    }
    public void setHomeSchool(String s){
        homeSchool = s;
    }
    public String printWelcome(){
        return "Welcome to Israel " + getName() + " from " + getHomeSchool();
    }
}
