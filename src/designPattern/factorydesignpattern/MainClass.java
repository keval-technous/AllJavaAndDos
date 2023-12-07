package designPattern.factorydesignpattern;
import java.util.Scanner;
public class MainClass {
    public static void mainFactory()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 for truck");
        System.out.println("2 for ship");
        System.out.println("Enter your choice:");
        int facchoice=scanner.nextInt();
        Transport ts= TransportFactory.getTransportVehicle(facchoice);
        System.out.println(ts.deliver());

    }
}
