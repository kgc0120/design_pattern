package com.bumblebee.designpattern.creational.builder;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bumblebee
 */
class BuilderTest {

    @Test
    void test() {
//        TourPlanBuilder builder = new DefaultTourBuilder();
//        TourPlan plan = builder.title("하와이")
//                .nightsAndDays(2, 3)
//                .startDate(LocalDate.of(2023, 5, 7))
//                .whereToStay("리조트")
//                .addPlan(0, "체크인 점심")
//                .addPlan(0, "와이키키 해변 관광")
//                .getPlan();
//
//
//        TourPlan longBeachTrip = builder.title("롱비치")
//                .startDate(LocalDate.of(2023, 5, 7))
//                .getPlan();

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        director.hawaliTrip();
        director.longBeachTrip();
    }

}