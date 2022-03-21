package com.bumblebee.designpattern.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private String apartment;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) { instance = new ThreadSafeSingleton();}
        return instance;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }


}
