package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void getPersonInfo(){
        System.out.println("Mam na imię " + this.firstName + ". Mam " + this.age + ". Pracuję jako " + this.job.getResponsibilities());
    }

    public static void main(String[] args) {
        Job driver = new Driver(10000, "kierowca");

        Job programmer = new Programmer(15000, "programista");
        Person person = new Person("Tadek", 35, programmer);
        person.getPersonInfo();


    }
}
