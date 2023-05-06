package com.bumblebee.designpattern.creational.singleton;

/**
 * @author bumblebee
 *
 * synchronized 키워드 사용해서 동시에 메서드에 접근 못하도록 한다.
 * 단점 : 동기화 처리하는 작업 때문에 성능에 불이익이 생길 수 있다.(lock을 잡아서 처리하기 때문에)
 */
public class ThreadSafeV1 {

    private static ThreadSafeV1 instance;

    private ThreadSafeV1() {}

    public static synchronized ThreadSafeV1 getInstance() {
        if (instance == null) {
            instance = new ThreadSafeV1();
        }
        return instance;
    }

}
