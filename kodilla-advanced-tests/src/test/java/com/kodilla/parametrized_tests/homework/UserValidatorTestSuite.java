package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"test", "Marta-Kowalska", "AnnaNowak79", "Anna_Nowak_79", "Anna.Nowak"})
    public void shouldReturnTrueIfUserNameIsValid(String text){
        boolean result = userValidator.validateUsername(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"te", "Marta!^&$", "23AnnaNowak79@#%", "AnnaNowak_79+", "Anna.Nowak@wp.pl"})
    public void shouldReturnFalseIfUserNameIsNotValid(String text){
        boolean result = userValidator.validateUsername(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings={"anna.nowak@wp.pl", "Anna_nowak@com.pl"})
    public void shouldReturnTrueIfEmailIsValid(String email){
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings={"anna.nowak.***#2123@wp.pl", "Anna_nowak#@com.pl", "an)@wp.pl"})
    public void shouldReturnFalseIfEmailIsNotValid(String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

}


