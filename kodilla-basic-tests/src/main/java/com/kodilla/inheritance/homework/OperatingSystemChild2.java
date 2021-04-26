package com.kodilla.inheritance.homework;

public class OperatingSystemChild2 extends OperatingSystem{

    public OperatingSystemChild2(int yearOfOS){
        super(yearOfOS);
    }

    @Override
    public void turnOn(){
        System.out.println("Turn On this OS Now!");
    }
}
