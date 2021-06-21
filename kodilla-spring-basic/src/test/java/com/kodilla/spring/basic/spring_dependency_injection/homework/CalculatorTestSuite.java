package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.homework.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator calculator = context.getBean(Calculator.class);

    @Test
    public void shouldAddTwoNumbers() {
        // when
        double sum = calculator.add(5, 2);

        // then
        assertEquals(7, sum);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        // when
        double diff = calculator.subtract(10, 5);

        // then
        assertEquals(5, diff);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        // when
        double product = calculator.multiply(3, 4);

        // then
        assertEquals(12, product);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        // when
        double quotient = calculator.divide(10, 2);

        // then
        assertEquals(5, quotient);
    }
}
