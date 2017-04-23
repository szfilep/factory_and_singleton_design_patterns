package com.progmasters.ex02_coachfactory.coachimpl;

import com.progmasters.ex02_coachfactory.Coach;

public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

}
