package com.bumblebee.designpattern.creational.singleton;

public class SingletonStatic {

    private static SingletonStatic instance;

    private SingletonStatic() {

    }

    static {
        try {
            instance = new SingletonStatic();
        }catch (Exception e) {
            throw new RuntimeException("인스턴스 생성 에러");
        }
    }

    public static SingletonStatic getInstance() {
        return instance;
    }

}
