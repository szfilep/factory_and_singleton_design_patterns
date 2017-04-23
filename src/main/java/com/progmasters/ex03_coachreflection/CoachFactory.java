package com.progmasters.ex03_coachreflection;

/**
 * This factory example uses Java Reflection API to create a new object with the name of the class.
 * (practically without calling new SwimCoach() )
 * <p>
 * 'Class' type represents a Java class (or a Java interface).
 * <p>
 * First we have to get the class 'object' from JVM by its name.
 * <p>
 * Then using reflection API we can create an object.
 */
public class CoachFactory {

    public static Coach getCoach(String coachClassName) {
        try {
            // Returns the Class object associated with the class:
            Class coachClass = Class.forName(coachClassName);

            // Creates a new instance of the class represented by this Class object.
            return (Coach) coachClass.newInstance();

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new IllegalArgumentException("Class cannot be instantiated!", e);
        }
    }
}
