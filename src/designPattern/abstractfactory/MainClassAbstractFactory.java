package designPattern.abstractfactory;
import java.util.Scanner;
public class MainClassAbstractFactory {
    public static void mainAbstractFactory()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for windows button");
        System.out.println("2 for linux button");
        System.out.println("3 for windows CheckBox");
        System.out.println("4 for linux CheckBox");

        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        AbstractFactory abstractFactoryobj=new WindowaFactory();
        System.out.println(abstractFactoryobj.getButton(choice).buttonDescription());
    }
}
