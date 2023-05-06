package com.bumblebee.designpattern.creational.singleton;

/**
 * @author bumblebee
 *
 * double checked locking
 * 효율적인 동기화 블럭 생성
 *
 * synchronized 키워드를 효율적으로 사용 가능하다.
 */
public class ThreadSafeV3 {

    private static volatile ThreadSafeV3 instance;

    private ThreadSafeV3() {}

    public static ThreadSafeV3 getInstance() {
        if(instance == null) {
            synchronized (ThreadSafeV3.class) {
                if(instance == null) {
                    instance = new ThreadSafeV3();
                }
            }
        }
        return instance;
    }

}
