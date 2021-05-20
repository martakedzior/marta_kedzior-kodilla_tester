package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class FlightFinderTestSuite {

    @Test
    public void testFlightFinderToCheckfindFlightsFrom(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> departures = flightFinder.findFlightsFrom("Krakow");
        //then
        assertEquals(2, departures.size());
    }

    @Test
    public void testFlightFinderToCheckfindFlightsFromZeroResult(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> departures = flightFinder.findFlightsFrom("Gdansk");
        //then
        assertEquals(0, departures.size());
    }

    @Test
    public void testFlightFinderToCheckfindFlightsToZeroResult(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> arrival = flightFinder.findFlightsTo("Krakow");
        //then
        assertEquals(0, arrival.size());
    }

    @Test
    public void testFlightFinderToCheckfindFlightsTo(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> arrival = flightFinder.findFlightsTo("Warszawa");
        //then
        assertEquals(1, arrival.size());
    }
}
