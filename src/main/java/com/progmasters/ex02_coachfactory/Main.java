package com.progmasters.ex02_coachfactory;


import com.progmasters.ex02_coachfactory.coachimpl.CoachFactory;

/**
 * This exercise is to demonstrate decoupling this Main class from the possible coach implementations.
 * This Main class should only depend on Coach interface and the possible types, but not the coach implementations!
 *
 * <p>
 * Exercise: add a new sport, like BaseballCoach and try it from main method.
 *  -
 */
public class Main {

    public static void main(String[] args) {

        Coach theCoach = CoachFactory.getCoach(SportType.TENNIS);

        System.out.println(theCoach.getDailyWorkout());
    }
}
