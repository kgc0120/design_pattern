package com.bumblebee.designpattern.structural.adapter;

public class MovableAdapterImpl implements MovableAdapter{

    private Movable luxuryCars;

    // standard constructors
    MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
