package com.kodilla.stream.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirportRepositoryTest {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        //then
        assertTrue(isWarsawInUse);
    }

    @Test
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        // then
        assertThrows(AirportNotFoundException.class, () -> assertFalse(isWarsawInUse));
    }


}