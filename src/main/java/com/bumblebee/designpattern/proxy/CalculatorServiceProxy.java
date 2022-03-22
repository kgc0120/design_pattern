package com.bumblebee.designpattern.proxy;

public class CalculatorServiceProxy implements Calculator{

    private int result;

    @Override
    public int plus(int left, int right) {
        long beforeTime = System.currentTimeMillis();

        result = left + right;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println(" plus 계산 시간(m) : "+secDiffTime);

        return result;
    }

    @Override
    public int subtract(int left, int right) {
        long beforeTime = System.currentTimeMillis();

        result = left - right;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("subtract 계산 시간(m) : "+secDiffTime);

        return result;
    }
}
