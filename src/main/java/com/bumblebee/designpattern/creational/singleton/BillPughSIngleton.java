package com.bumblebee.designpattern.creational.singleton;

public class BillPughSIngleton {

    private String apartment;

    private BillPughSIngleton(){}

    private static class SingletonHelper{
        private static final BillPughSIngleton INSTANCE = new BillPughSIngleton();
    }

    public static BillPughSIngleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public String getApartment() {
        return apartment;
    }

    public String setApartment(String apartment) {
        this.apartment = apartment;
        return apartment;
    }

}
