package com.rooney.james.calculator.util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
//@ContextConfiguration(classes = ExternalPropsPropertySourceTestConfig.class)
class CalculateTest {

    private Calculate calculate = new Calculate();

    @Test
    void addIntegers() {
        int expectedResult = 3;

        int actualResult = calculate.addIntegers(1, 2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void addTwoMoreIntegers() {
        int expectedResult = 20;

        int actualResult = calculate.addIntegers(15, 5);

        assertEquals(expectedResult, actualResult);
    }
}