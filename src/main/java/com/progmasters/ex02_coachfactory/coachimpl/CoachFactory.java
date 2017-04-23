package com.progmasters.ex02_coachfactory.coachimpl;

import com.progmasters.ex02_coachfactory.Coach;
import com.progmasters.ex02_coachfactory.SportType;

public class CoachFactory {

    public static Coach getCoach(SportType sportType) {
        Coach resultCoach;
        switch (sportType) {
            case TENNIS:
                resultCoach = new TennisCoach();
                break;
            case SWIM:
                resultCoach = new SwimCoach();
                break;
            default:
                resultCoach = null;
                break;
        }

        return resultCoach;
    }
}
