package com.bumblebee.designpattern.behavioral.chainofreponsibility;

public class Hanrabong3k implements HanrabongChain{

    private HanrabongChain hanrabongChain;

    @Override
    public void setNextChain(HanrabongChain nextChain) {
        this.hanrabongChain = nextChain;
    }

    @Override
    public void weightFilter(int weight) {
        if(weight >= 3) {
            System.out.println("IN 3kg box!");
        } else {
            this.hanrabongChain.weightFilter(weight);
        }
    }
}
