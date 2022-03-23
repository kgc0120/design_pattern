package com.bumblebee.designpattern.behabioral.template;

public class PhoneFactory extends FactoryTemplate {

    @Override
    public void productProcess() {
        System.out.println("핸드폰 공장 프로세스 가동!");
    }
}
