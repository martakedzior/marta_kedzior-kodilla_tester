package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Znaczek nr1", 23, Boolean.TRUE));
        stamps.add(new Stamp("Znaczek nr2", 15, Boolean.FALSE));
        stamps.add(new Stamp("Znaczek nr1", 23, Boolean.TRUE));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
