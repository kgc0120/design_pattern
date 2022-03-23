package com.bumblebee.designpattern.behabioral.chainofreponsibility;

public interface HanrabongChain {

    void setNextChain(HanrabongChain nextChain);
    void weightFilter(int weight);

}
