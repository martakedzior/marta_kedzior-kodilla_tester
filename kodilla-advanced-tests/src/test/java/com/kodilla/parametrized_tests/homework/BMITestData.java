package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMITestData {

    static Stream<Arguments> shouldCalculateBMI2() {
        return Stream.of(
                Arguments.of(1.89, 50, "Very severely underweight"),
                Arguments.of(1.89, 55, "Severely underweight"),
                Arguments.of(1.56, 45, "Underweight"),
                Arguments.of(1.89, 75, "Normal (healthy weight)"),
                Arguments.of(1.89, 100, "Overweight"),
                Arguments.of(1.89, 120, "Obese Class I (Moderately obese)"),
                Arguments.of(1.89, 130, "Obese Class II (Severely obese)"),
                Arguments.of(1.89, 160, "Obese Class III (Very severely obese)"),
                Arguments.of(1.89, 175, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.89, 190, "Obese Class V (Super Obese)"),
                Arguments.of(1.89, 250, "Obese Class VI (Hyper Obese)")
        );
    }
}
