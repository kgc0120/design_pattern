package com.bumblebee.designpattern.creational.singleton;

/**
 * @author bumblebee
 *
 * 이른 초기화(eager initialization)
 * 인스턴스를 미리 만들어 놓는다.
 *
 * 단점 : 쓰지 않아도 미리 만들어 놓는다.
 */
public class ThreadSafeV2 {

    private static final ThreadSafeV2 INSTANCE = new ThreadSafeV2();

    private ThreadSafeV2() {}

    public static ThreadSafeV2 getInstance() {
        return INSTANCE;
    }

}
