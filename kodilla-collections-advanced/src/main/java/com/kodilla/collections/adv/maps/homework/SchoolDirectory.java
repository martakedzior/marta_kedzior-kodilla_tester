package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> schoolPrincipalHashMap = new HashMap<>();
        School lo2 = new School("Liceum Ogólnokształcące nr 2","Ania", "Janek");
        School lo3 = new School("Liceum Ogólnokształcące nr 3", "Agnieszka", "Marysia", "Zbyszek");

        Principal lo2Principal = new Principal("Jacek", "Wydolny");
        Principal lo3Principal = new Principal("Anna", "Kowalska");

        schoolPrincipalHashMap.put(lo2, lo2Principal);
        schoolPrincipalHashMap.put(lo3, lo3Principal);

        for (Map.Entry<School, Principal> schoolPrincipalEntry : schoolPrincipalHashMap.entrySet())
            System.out.println("Dyrektor szkoły: " + schoolPrincipalEntry.getValue().getFirstname() + " " + schoolPrincipalEntry.getValue().getLastname() + ", " + schoolPrincipalEntry.getKey().getSchoolName() + ", Liczba studentów: " + schoolPrincipalEntry.getKey().getNumber());
    }
}
