package com.bumblebee.designpattern.behavioral.chainofreponsibility;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class HanrabongChainTest {

    @Test
    void hanrabongFilterTest() {

        HanrabongChain hanrabongChain = getHanrabongChain();

        Hanrabong hanrabong5 = new Hanrabong(5);
        Hanrabong hanrabong12 = new Hanrabong(12);
        Hanrabong hanrabong7 = new Hanrabong(7);
        Hanrabong hanrabong4 = new Hanrabong(4);
        Hanrabong hanrabong1 = new Hanrabong(1);

        List<Hanrabong> rabongList = Arrays.asList(hanrabong5, hanrabong12, hanrabong7, hanrabong4, hanrabong1);

        for (Hanrabong hanrabong : rabongList) {
            hanrabongChain.weightFilter(hanrabong.getWeight());
        }


    }

    private HanrabongChain getHanrabongChain() {
        HanrabongChain hanrabong10k = new Hanrabong10k();
        HanrabongChain hanrabong5k = new Hanrabong5k();
        HanrabongChain hanrabong3k = new Hanrabong3k();

        hanrabong10k.setNextChain(hanrabong5k);
        hanrabong5k.setNextChain(hanrabong3k);
        return hanrabong10k;
    }

}