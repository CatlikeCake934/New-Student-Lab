package com.company;

public class Main {

    public static void main(String[] args) {
	    Student student = new Student("Cat Cake", 35788);
        System.out.println(student.printWelcome());
        HellerStudent hs = new HellerStudent("Cat Cake", "Home School", 35782);
        System.out.println(hs.printWelcome());
    }
}
