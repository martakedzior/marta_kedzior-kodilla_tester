package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {

    private List<Flight> flights = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> resultFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure)) {
                resultFlights.add(flight);
            }
        }
        return resultFlights;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> resultFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival)) {
                resultFlights.add(flight);
            }
        }
        return resultFlights;
    }

}
