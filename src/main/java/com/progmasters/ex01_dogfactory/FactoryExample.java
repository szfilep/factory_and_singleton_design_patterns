package com.progmasters.ex01_dogfactory;

/**
 * A criteria for a dog.
 */
enum DogType {
    SMALL, BIG, WORKING;
}

/**
 * Our Dog interface.
 */
interface Dog {
    public void speak();
}

/**
 * A "driver" program to demonstrate our "dog factory".
 * <p>
 * Read: http://alvinalexander.com/java/java-factory-pattern-example
 */
public class FactoryExample {
    public static void main(String[] args) {
        // create a small dog
        Dog dog = DogFactory.getDog(DogType.SMALL);
        dog.speak();

        // create a big dog
        dog = DogFactory.getDog(DogType.BIG);
        dog.speak();

        // create a working dog
        dog = DogFactory.getDog(DogType.WORKING);
        dog.speak();
    }

}

/**
 * Our Factory class.
 */
class DogFactory {
    public static Dog getDog(DogType dogType) {
        // TODO implement factory pattern to return the Dog object that was requested
        // you can use == and equals() as well when comparing enums

        return null;
    }
}


// Our concrete class implementations 

class Poodle implements Dog {
    public void speak() {
        System.out.println("The poodle says \"arf\"");
    }
}

class Rottweiler implements Dog {
    public void speak() {
        System.out.println("The Rottweiler says (in a very deep voice) \"WOOF!\"");
    }
}

class SiberianHusky implements Dog {
    public void speak() {
        System.out.println("The husky says \"Dude, what's up?\"");
    }
}
