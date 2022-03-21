package com.bumblebee.designpattern.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }


    public static Singleton getInstance() {
        return instance;
    }

    public void printSingleton() {
        System.out.println("singleton!!");
    }



}
