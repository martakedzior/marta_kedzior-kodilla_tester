package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Krakow", "Warszawa"));
        flightList.add(new Flight("Krakow", "Londyn"));
        flightList.add(new Flight("Warszawa", "Berlin"));
        return flightList;
    }
}
