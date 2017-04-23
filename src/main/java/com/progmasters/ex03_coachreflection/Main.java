package com.progmasters.ex03_coachreflection;


/**
 * This exercise is to demonstrate Java Reflection API.
 * <p>
 * First check CoachFactory and then do this exercise.
 * <p>
 * Exercise: add SoccerCoach class and try it from the main method.
 */
public class Main {

    public static void main(String[] args) {

        Coach theCoach = CoachFactory.getCoach("com.progmasters.ex03_coachreflection.SwimCoach");

        System.out.println(theCoach.getDailyWorkout());
    }
}
