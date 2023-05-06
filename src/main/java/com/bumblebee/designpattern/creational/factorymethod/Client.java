package com.bumblebee.designpattern.creational.factorymethod;

/**
 * @author bumblebee
 */
public class Client {

    public void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name,email));
    }

}
