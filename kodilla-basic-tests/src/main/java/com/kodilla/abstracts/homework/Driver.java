package com.kodilla.abstracts.homework;

public class Driver extends Job {
    public Driver(int salary, String responsibilities) {
        super(10000, "Driving taxi");
    }

    @Override
    public String getResponsibilities() {
        return "Driving taxi";
    }
}
