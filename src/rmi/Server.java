package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Calculator {

    public Server() throws RemoteException {
    }

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }

    public static void server() throws RemoteException{
        try {
            Registry registry= LocateRegistry.createRegistry(8000);
            registry.rebind("hello server",new Server());
        }
        catch (RemoteException remoteException)
        {
            remoteException.printStackTrace();
        }
    }
}
