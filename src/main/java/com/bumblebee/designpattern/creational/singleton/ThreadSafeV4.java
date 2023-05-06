package com.bumblebee.designpattern.creational.singleton;

/**
 * @author bumblebee
 *
 * static inner 클래스 사용
 * 권장하는 방법
 */
public class ThreadSafeV4 {

    private ThreadSafeV4() {}

    private static class ThreadSafeV4Holder {
        private static final ThreadSafeV4 INSTANCE = new ThreadSafeV4();
    }

    public static ThreadSafeV4 getInstance() {
        return ThreadSafeV4Holder.INSTANCE;
    }

}
