package com.bumblebee.designpattern.creational.builder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class HouseTest {

    @Test
    void HouseBuilderTest() {

        String houseAddress = "서울특별시 관악구";
        String houseType = "매매";
        Long housePrice = 10000000L;

        House house =  new House.HouseBuilder(1L, houseAddress, houseType)
                                .price(housePrice)
                                .build();

        assertThat(house.getAddress(), is(houseAddress));
        assertThat(house.getType(), is(houseType));
        assertThat(house.getPrice(), is(housePrice));

    }


}