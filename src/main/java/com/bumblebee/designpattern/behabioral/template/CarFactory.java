package com.bumblebee.designpattern.behabioral.template;

public class CarFactory extends FactoryTemplate{

    @Override
    public void productProcess() {
        System.out.println("자동차 공장 프로세스 가동!");
    }

}
