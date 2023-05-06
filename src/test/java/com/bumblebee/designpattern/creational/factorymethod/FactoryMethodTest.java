package com.bumblebee.designpattern.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bumblebee
 */
class FactoryMethodTest {

    @Test
    void test() {
//        클라이언트 코드는 변경되었다. 하지만 인터페이스 기반으로 코딩되면 변경되지 않는다.
//        Ship samsungShip = SamsungShipFactory.orderShip("samsung", "samsung@samsung.com");


//        Ship samsungShip = new SamsungShipFactory().orderShip("samsung", "samsung@samsung.com");
//        System.out.println(samsungShip);
//
//        Ship stxShip = new StxShipFactory().orderShip("stx", "stx@stx.com");
//        System.out.println(stxShip);


        Client client = new Client();
        client.print(new SamsungShipFactory(), "samsung", "samsung@samsung.com");
        client.print(new StxShipFactory(), "stx", "stx@stx.com");
    }


}