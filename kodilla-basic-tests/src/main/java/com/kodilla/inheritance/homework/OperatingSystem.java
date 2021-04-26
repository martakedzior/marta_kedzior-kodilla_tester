package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfOS;

    public OperatingSystem(int yearOfOS){
        this.yearOfOS = yearOfOS;
    }

    public void turnOn(){
        System.out.println("Turn On your Operating System");
    }

    public void turnOff(){
        System.out.println("Turn Off your Operating System");
    }

    public int getYearOfOS() {
        return yearOfOS;
    }
}
