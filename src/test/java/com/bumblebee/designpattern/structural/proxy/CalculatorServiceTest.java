package com.bumblebee.designpattern.structural.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorServiceTest {

    @Test
    void calculatorService() {

        Calculator calculatorService = new CalculatorService();

        int left = 10000;
        int right = 5000;

        int plusResult = calculatorService.plus(left, right);
        int subtractResult = calculatorService.subtract(left, right);

        assertEquals(plusResult, left+right);
        assertEquals(subtractResult, left-right);

    }

    @Test
    void calculatorServiceProxy() {

        Calculator calculatorServiceProxy = new CalculatorServiceProxy();

        int left = 10000;
        int right = 5000;

        int plusResult = calculatorServiceProxy.plus(left, right);
        int subtractResult = calculatorServiceProxy.subtract(left, right);

        assertEquals(plusResult, left+right);
        assertEquals(subtractResult, left-right);

    }


}