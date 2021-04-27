package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public static void main(String[] args) {
        Job driver = new Driver(10000, "driving");
        Person person = new Person("Tadek", 35, "Driver");

        System.out.println(driver.getResponsibilities());


    }
}
