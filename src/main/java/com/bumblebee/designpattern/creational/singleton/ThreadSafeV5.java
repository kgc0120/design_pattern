package com.bumblebee.designpattern.creational.singleton;

/**
 * @author bumblebee
 *
 * enum을 이용하면 리플렉션을 이용해도 newInstance를 할 수 없다. 막아져 있다.
 * 권장 하는 방법
 *
 * 단점 : 1.미리 만들어 놓는다. 2.상속을 쓰지 못한다.
 */
public enum ThreadSafeV5 {

    INSTANCE;

}


