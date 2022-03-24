package com.bumblebee.designpattern.behavioral.chainofreponsibility;

public interface HanrabongChain {

    void setNextChain(HanrabongChain nextChain);
    void weightFilter(int weight);

}
