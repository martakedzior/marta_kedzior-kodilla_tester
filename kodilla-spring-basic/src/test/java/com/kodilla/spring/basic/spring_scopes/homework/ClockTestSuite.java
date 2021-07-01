package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTimes() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        // when
        Clock firstClock = context.getBean(Clock.class);
        Clock secondClock = context.getBean(Clock.class);

        // then
        Assertions.assertNotEquals(firstClock.getCurrentTime(), secondClock.getCurrentTime());
    }
}