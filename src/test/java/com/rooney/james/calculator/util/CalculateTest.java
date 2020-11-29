package com.rooney.james.calculator.util;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void addIntegers() {
        int expectedResult = 3;

        Calculate calculate = new Calculate();

        int actualResult = calculate.addIntegers(1, 2);

        assertEquals(expectedResult, actualResult);
    }
}