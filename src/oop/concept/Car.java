package oop.concept;

/**
 * What is class ?
 * Ans:A class is a template definition of the methods and variables in a particular kind of object.
 */
public class Car implements vehicle{


     @Override
    public String start(String message) {
        return message;
    }

    @Override
    public String stop(String message) {
        return message;
    }

    @Override
    public String exilator(String exilatorSound) {
        return exilatorSound;
    }

    @Override
    public String vehicleType(String vehicleType) {
        return vehicleType;
    }

}
