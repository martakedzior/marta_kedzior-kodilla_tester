package com.kodilla.abstracts.homework;

public class Programmer extends Job {
    public Programmer(int salary, String responsibilities) {
        super(20000, "Writes programs.");
    }

    @Override
    public String getResponsibilities() {
        return "Writes programs.";
    }
}
