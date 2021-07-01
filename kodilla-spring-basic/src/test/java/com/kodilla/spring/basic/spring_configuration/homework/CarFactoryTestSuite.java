package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {
    @Test
    public void shouldChooseTheCarForCurrentSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("dependingOnSeason");
        String carType = car.getCarType();
        Assertions.assertEquals("Cabrio", carType);
    }

    @Test
    public void shouldCheckIfHasHeadlightsTurnedOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("dependingOnSeason");
        boolean headlightsStatus = car.hasHeadlightsTurnedOn();
        Assertions.assertFalse(headlightsStatus);
    }

}