package com.bumblebee.designpattern.structural.adapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AdapterPatternTest {

    @Test
    void 어댑터_테스트() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println(bugattiVeyronAdapter.getSpeed());
        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);

    }


}