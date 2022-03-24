package com.bumblebee.designpattern.behavioral.chainofreponsibility;

public class Hanrabong5k implements HanrabongChain{

    private HanrabongChain hanrabongChain;

    @Override
    public void setNextChain(HanrabongChain nextChain) {
        this.hanrabongChain = nextChain;
    }

    @Override
    public void weightFilter(int weight) {
        if(weight >= 5) {
            System.out.println("IN 5kg box!");
        } else {
            this.hanrabongChain.weightFilter(weight);
        }
    }
}
