package com.progmasters.ex02_coachfactory.coachimpl;


import com.progmasters.ex02_coachfactory.Coach;

public class SwimCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

}




