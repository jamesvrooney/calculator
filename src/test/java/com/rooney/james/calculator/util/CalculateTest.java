package com.rooney.james.calculator.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateTest {

    @Test
    void addIntegers() {
        int expectedResult = 3;

        Calculate calculate = new Calculate();

        int actualResult = calculate.addIntegers(1, 2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void addTwoMoreIntegers() {
        int expectedResult = 20;

        Calculate calculate = new Calculate();

        int actualResult = calculate.addIntegers(15, 5);

        assertEquals(expectedResult, actualResult);
    }
}