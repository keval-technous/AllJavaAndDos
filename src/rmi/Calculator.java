package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * What is rmi?
 * Remote Method Invocation (RMI) is an application programming interface (API) in the Java programming language and development environment. It allows objects on one computer or Java Virtual Machine (JVM) to interact with objects running on a different JVM in a distributed network.
 */
public interface Calculator extends Remote{
    public double add(double a,double b) throws RemoteException;
    public double subtraction(double a,double b) throws RemoteException;
    public double multiplication(double a,double b) throws RemoteException;
    public double division(double a,double b) throws RemoteException;
}
