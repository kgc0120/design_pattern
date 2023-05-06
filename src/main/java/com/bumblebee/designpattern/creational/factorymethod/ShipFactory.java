package com.bumblebee.designpattern.creational.factorymethod;

/**
 * @author bumblebee
 * 장점(느슨한 결합)
 * 확장에 열려있고 변경에 닫혀있는 객체 지향 원칙을 적용해서
 * 기존에 인스턴스를 만드는 과정의 로직을 건드리지 않고 새로운 인스턴스를(그와 같은 류의) 다른 방법으로 확장이 가능하다.
 *
 * 단점
 * 각자의 역할을 나누다 보니 클래스가 늘어난다.
 */
public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    Ship createShip();

    private void validate(String name, String email) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if(email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

}
