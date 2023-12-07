package rmi;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class Client
{
    public static void client() throws RemoteException{
        Client client=new Client();
        client.connectRemote();
    }
    private void connectRemote() throws RemoteException
    {
        try {
            Scanner sc=new Scanner(System.in);
            Registry registry= LocateRegistry.getRegistry("localhost",8000);
            Calculator calculator=(Calculator) registry.lookup("hello server");
            System.out.println("Enter Any No:");
            double no1=sc.nextDouble();
            System.out.println("Enter Any No:");
            double no2=sc.nextDouble();
            System.out.println(calculator.add(no1,no2));
        }catch (RemoteException | NotBoundException randbexception)
        {
            randbexception.printStackTrace();
        }
    }

}
