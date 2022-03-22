package com.bumblebee.designpattern.template;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FactoryTemplateTest {

    @Test
    void templatePatternTest() {

        FactoryTemplate factory;
        factory = new CarFactory();
        factory.buildProduct();

        System.out.println("=======================");

        factory= new PhoneFactory();
        factory.buildProduct();

    }


}