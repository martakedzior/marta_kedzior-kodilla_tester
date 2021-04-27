package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 15;
        int b = 5;
        int subResult = calculator.substract(a, b);
        assertEquals(10, subResult);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        int a = 3;
        double powResult = calculator.power(a);
        assertEquals(9, powResult);
    }

    @Test
    public void testPowerLessThanZero() {
        Calculator calculator = new Calculator();
        int a = - 3;
        double powResult = calculator.power(a);
        assertEquals(9, powResult);
    }

    @Test
    public void testPowerZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        double powResult = calculator.power(a);
        assertEquals(0, powResult);
    }

}
