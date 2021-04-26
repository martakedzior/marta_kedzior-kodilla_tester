package com.kodilla.inheritance.homework;

public class OperatingSystemChild extends OperatingSystem{

    public OperatingSystemChild(int yearOfOS){
        super(yearOfOS);
    }

    @Override
    public void turnOff(){
        System.out.println("Turn Off everything! Kill Me!");
    }
}
