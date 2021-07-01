package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.MonthDay;

@Component
public class CarFactory {

    @Bean
    public Car dependingOnSeason() {
        Car car;
        if ((MonthDay.now().isAfter(MonthDay.of(3,20))
                && MonthDay.now().isBefore(MonthDay.of(6,21)))
                || (MonthDay.now().isAfter(MonthDay.of(8,20))
                && MonthDay.now().isBefore(MonthDay.of(12,21)))) {
            car = new Sedan();
        } else if (MonthDay.now().isAfter(MonthDay.of(12,20))
                && MonthDay.now().isBefore(MonthDay.of(3,21))) {
            car = new SUV();
        } else {
            car = new Cabrio();
        }
        return car;
    }

}
