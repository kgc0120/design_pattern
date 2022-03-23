package com.bumblebee.designpattern.behabioral.template;

public abstract class FactoryTemplate {

    public final void buildProduct() {
        baseMaterial();
        productProcess();
        finishProduct();
    }

    private void baseMaterial() {
        System.out.println("원/부자재 수입");
    }

    public abstract void productProcess();

    private void finishProduct() {
        System.out.println("제품 완성");
    }

}
