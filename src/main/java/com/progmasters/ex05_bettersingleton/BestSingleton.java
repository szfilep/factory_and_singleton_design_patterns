package com.progmasters.ex05_bettersingleton;

import com.progmasters.ex03_coachreflection.SwimCoach;

/**
 * Enum is a special type in Java, used to define a list of constants. Basically they are very simple,
 * but they can be used in a more advanced way, for example to implement a Singleton :).
 *
 * Why does it work?
 * -----------------
 * Enums have private constructors, are final and provide proper serialization machinery.
 * They are also very concise and lazily initialized in a thread safe manner.
 * <p>
 * The JVM provides a guarantee that enum values will not be instantiated more than once each,
 * which gives the enum singleton pattern a very strong defense against reflection attacks.
 * <p>
 * This is the recommended way of implementing the singleton pattern, as explained by Joshua Bloch
 * in Effective Java: http://www.informit.com/articles/article.aspx?p=1216151&seqNum=3
 *
 * Exercise: play with this enum!
 *  - try what happens if you add another enum value (eg. INSTANCE1, INSTANCE2) and sout (System.out.println) both from main method
 *
 */
public enum BestSingleton {
    INSTANCE;

    // Originally enum has an implicit empty constructor. Let's make it explicit instead.
    // Constructor runs for every enum value. Currently there is only one enum value: INSTANCE.
    // (Try what happens if you add another one and sout it from main)
    BestSingleton() {
        System.out.println("Hi there");
    }

    // you can create methods as well in enums:
    void doStuff() {
        System.out.println("I am doing stuff");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(BestSingleton.INSTANCE);

        BestSingleton.INSTANCE.doStuff();
    }
}
