package com.kodilla.inheritance.homework;

public class OperatingSystemMain {
    public static void main(String[] args){
        OperatingSystem operatingSystem = new OperatingSystem(1979);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        OperatingSystemChild operatingSystemChild = new OperatingSystemChild(2020);
        operatingSystemChild.turnOff();

        OperatingSystemChild2 operatingSystemChild2 = new OperatingSystemChild2(2010);
        operatingSystemChild2.turnOn();
    }
}
