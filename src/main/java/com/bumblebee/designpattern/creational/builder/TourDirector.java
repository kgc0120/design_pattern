package com.bumblebee.designpattern.creational.builder;

import java.time.LocalDate;

/**
 * @author bumblebee
 */
public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan hawaliTrip() {
        return tourPlanBuilder.title("하와이")
                        .nightsAndDays(2, 3)
                        .startDate(LocalDate.of(2023, 5, 7))
                        .whereToStay("리조트")
                        .addPlan(0, "체크인 점심")
                        .addPlan(0, "와이키키 해변 관광")
                        .getPlan();
    }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2023, 5, 7))
                .getPlan();
    }

}
