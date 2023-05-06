package com.bumblebee.designpattern.creational.factorymethod;

/**
 * @author bumblebee
 */
public class SamsungShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new SamsungShip();
    }
}
