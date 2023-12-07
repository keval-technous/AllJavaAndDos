package designPattern.factorydesignpattern;


/**
 * Factory design pattern
 * What is use of factory design pattern?
 * The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
 */
public class TransportFactory {
    public static Transport getTransportVehicle(int no)
    {
        Transport ts=null;
        switch (no)
        {
            case 1:
                ts=new Truck();
                break;
            case 2:
                ts=new Ship();
                break;
            default:
                System.out.println("Transport vehicle not available");
                break;
        }
        return ts;
    }
}
