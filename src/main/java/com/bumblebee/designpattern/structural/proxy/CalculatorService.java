package com.bumblebee.designpattern.structural.proxy;

public class CalculatorService implements Calculator{

    private int result;

    @Override
    public int plus(int left, int right) {
        result = left + right;
        return result;
    }

    @Override
    public int subtract(int left, int right) {
        result = left - right;
        return result;
    }
}
