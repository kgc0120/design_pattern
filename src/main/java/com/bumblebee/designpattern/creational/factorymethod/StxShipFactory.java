package com.bumblebee.designpattern.creational.factorymethod;

/**
 * @author bumblebee
 */
public class StxShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new StxShip();
    }
}
