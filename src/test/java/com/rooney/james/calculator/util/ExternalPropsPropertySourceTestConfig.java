package com.rooney.james.calculator.util;


import org.springframework.beans.factory.annotation.Value;

//@Configuration
//@PropertySource("classpath:application-test.properties")
public class ExternalPropsPropertySourceTestConfig {
    @Value("${developer.name}")
    private String name;
    @Value("${developer.age}")
    private String age;

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//
//        return propertySourcesPlaceholderConfigurer;
//    }

//    @Bean
//    Calculate getCalculate() {
//        Calculate calculate = new Calculate();
//
//        calculate.setName(name);
//        calculate.setAge(age);
//
//        return calculate;
//    }
}
