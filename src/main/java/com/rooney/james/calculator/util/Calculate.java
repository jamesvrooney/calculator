package com.rooney.james.calculator.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
@Data
public class Calculate {

    @Value("${developer.name}")
    private String name;
    @Value("${developer.age}")
    private String age;

    public int addIntegers(int num1, int num2) {
        log.info("My name is {}. I am {}", name, age);

        return num1 + num2;
    }
}
