package com.bumblebee.designpattern.creational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class SingletonTest {

    @Test
    void singleTonTest() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    void singleTonStaticTest() {
        SingletonStatic instance1 = SingletonStatic.getInstance();
        SingletonStatic instance2 = SingletonStatic.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    void singleTonStatefulTest() {

        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

        instance1.setApartment("아크로빌 아파트");
        instance2.setApartment("한남더힐 아파트");

        System.out.println(instance1);
        System.out.println(instance2);

        assertSame(instance1, instance2);
    }

    @Test
    void singleTonStatelessTest() {

        BillPughSIngleton instance1 = BillPughSIngleton.getInstance();
        BillPughSIngleton instance2 = BillPughSIngleton.getInstance();

        String apartment1 = instance1.setApartment("아크로빌 아파트");
        String apartment2 = instance2.setApartment("한남더힐 아파트");

        System.out.println(apartment1);
        System.out.println(apartment2);

        assertNotSame(apartment1, apartment2);
    }

}