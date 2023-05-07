package com.bumblebee.designpattern.creational.builder;

import java.time.LocalDate;
import java.util.List;

/**
 * @author bumblebee
 */
public class TourPlan {

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetatilPlan> plans;

    public TourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay, List<DetatilPlan> plans) {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }
}
