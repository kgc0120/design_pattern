package com.bumblebee.designpattern.behabioral.chainofreponsibility;

public class Hanrabong10k implements HanrabongChain{

    private HanrabongChain hanrabongChain;

    @Override
    public void setNextChain(HanrabongChain nextChain) {
        this.hanrabongChain = nextChain;
    }

    @Override
    public void weightFilter(int weight) {
        if(weight >= 10) {
            System.out.println("IN 10kg box!");
        } else {
            this.hanrabongChain.weightFilter(weight);
        }
    }
}
