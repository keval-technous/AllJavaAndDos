package oop.concept;

/**
 * An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 * Since Java 8, we can have default and static methods in an interface.
 */
public interface vehicle {
   String start(String message);
   String stop(String message);
   String exilator(String exilatorSound);
   String vehicleType(String vehicleType);
}
