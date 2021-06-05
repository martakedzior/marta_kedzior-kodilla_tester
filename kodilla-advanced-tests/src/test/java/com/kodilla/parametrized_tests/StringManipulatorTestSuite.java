package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTestSuite {
    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    @CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve", "null,llun", "A,a"})
    public void shouldReverseStringWithLowerCase(String input, String expected){
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase2(String input, String expected) {
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test,4", " OtHEr ,5", "E V e n t,5", "null ,4", "A,1"})
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3", "null :0", "A:0"}, delimiter = ':')
    public void shouldCountNumberOfCommas(String input, int expected) {
        assertEquals(expected, manipulator.countNumberOfCommas(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithCommas.csv", numLinesToSkip = 1, delimiter = ':')
    public void shouldCountNumberOfCommas2(String input, int expected) {
        assertEquals(expected, manipulator.countNumberOfCommas(input));
    }


}