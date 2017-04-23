package com.progmasters.ex04_singleton;

/**
 * When to use singleton pattern?
 *
 * Think about some game engine class. You want to be sure that there is only ONE instance of it, globally.
 *
 * In real life, typically logger frameworks use this.
 * (What is logging? Writing information to the console or into a file about what your program does.)
 *
 * Singleton pattern is one of the simplest design patterns in Java.
 * This type of design pattern comes under creational pattern.
 * <p>
 * This pattern involves a single class which is responsible to create an
 * object while making sure that only a single object gets created.
 *
 */
public class GameEngineSingleton {

    // create an object of SingleObject
    private static GameEngineSingleton instance;

    // make the constructor private so that this class cannot be instantiated
    private GameEngineSingleton(){}

    // get the only object available
    public static GameEngineSingleton getInstance(){
        if (instance == null) {
            instance = new GameEngineSingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
