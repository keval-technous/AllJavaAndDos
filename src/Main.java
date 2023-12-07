import collection.framework.*;
import designPattern.abstractfactory.MainClassAbstractFactory;
import designPattern.factorydesignpattern.MainClass;
import io.serialization.deserialization.DeSerializationEx;
import io.serialization.deserialization.SerializationEx;
import oop.concept.Car;
import oop.concept.Employee;
import oop.concept.encapsulation.Farmer;
import oop.concept.polymorphism.*;
import oop.concept.constructor.*;
import java.rmi.RemoteException;
import java.util.Scanner;
import designPattern.*;
import rmi.Client;
import rmi.Server;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws RemoteException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc=new Scanner(System.in);
        mainLable:
        while (true){
            System.out.println("1 for Oops");
            System.out.println("2 for Design Pattern");
            System.out.println("3 for Collection Framework");
            System.out.println("4 for Serialization and Deserialization");
            System.out.println("5 for RMI");
            System.out.println("6 for exit");
            System.out.println("Enter Your Main Choice");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    oopLable:
                    while (true)
                    {
                        System.out.println("1 for Interface");
                        System.out.println("2 for Abstract class");
                        System.out.println("3 for Polymorphism");
                        System.out.println("4 for Constructor");
                        System.out.println("5 for Encapsulation");
                        System.out.println("6 for oops exit");
                        System.out.println("Enter oops your choice:");
                        int oopChoice1=sc.nextInt();
                        switch (oopChoice1)
                        {
                            case 1:
                                /**
                                 * Interface
                                 */
                                System.out.println("Interface");
                                Car carObj=new Car();
                                System.out.println(carObj.start("start"));
                                break;
                            case 2:
                                /**
                                 * Abstract class
                                 */
                                System.out.println("Abstract class");
                                Employee empObj=new Employee();
                                System.out.println(empObj.getAddress());
                                System.out.println(empObj.getCname());
                                System.out.println("Enter Your Technology");
                                String technologyName=sc.nextLine();
                                System.out.println(empObj.employeeTechnology(technologyName));
                                break;
                            case 3:
                                /**
                                 * Polymorphism
                                 */
                                System.out.println("Polymorphism");
                                Pearson pearson=new Pearson();
                                System.out.println(pearson.speaking("hindi","english","tamil"));
                                break;
                            case 4:
                                /**
                                 * Constructor
                                 */
                                System.out.println("Constructor");
                                Student student=new Student("jay",25);
                                break;
                            case 5:
                                /**
                                 * Encapsulation
                                 */
                                System.out.println("Encapsulation");
                                Farmer farmer=new Farmer();
                                System.out.println("Enter farmer name :");
                                String fname=sc.nextLine();
                                farmer.setFname(fname);
                                System.out.println(farmer.getFname());

                                System.out.println("Enter farmer mobile :");
                                int fmobile=sc.nextInt();
                                farmer.setFmobile(fmobile);
                                System.out.println(farmer.getFmobile());

                                System.out.println("Enter farmer Product name :");
                                String fproduct=sc.nextLine();
                                farmer.setfProductName(fproduct);
                                System.out.println(farmer.getfProductName());

                                System.out.println("Enter farmer product Price :");
                                float fproductPrice=sc.nextFloat();
                                farmer.setfProductPrice(fproductPrice);
                                System.out.println(farmer.getfProductPrice());
                                break;
                            case 6 :
                                break oopLable;
                        }
                    }
                    break;
                case 2:
                    designpatternLable:
                    while (true)
                    {
                        System.out.println("1 for Singleton");
                        System.out.println("2 for Factory Design pattern");
                        System.out.println("3 for Abstract Design pattern");
                        System.out.println("4 for Design Pattern exit");
                        System.out.println("Enter your design pattern choice:");
                        int dpchoice=sc.nextInt();
                        switch (dpchoice)
                        {
                            case 1:
                                /**
                                 * Singleton design pattern
                                 */
                                System.out.println("Singleton design pattern");
                                SingletonDesignPattern singletonDesignPattern=SingletonDesignPattern.getInstance();
                                SingletonDesignPattern singletonDesignPattern1=SingletonDesignPattern.getInstance();
                                System.out.println(singletonDesignPattern.hashCode());
                                System.out.println(singletonDesignPattern1.hashCode());
                                break;
                            case 2:
                                /**
                                 * Factory Design Pattern
                                 */
                                MainClass.mainFactory();
                                break;
                            case 3:
                                /**
                                 * Abstract Factory
                                 */
                                MainClassAbstractFactory.mainAbstractFactory();
                            case 4:
                                break designpatternLable;

                        }
                    }
                    break;
                case 3:
                    collectionLable:
                    while (true)
                    {
                        System.out.println("1 for List Class");
                        System.out.println("2 for Set Class");
                        System.out.println("3 for List Collection Methods");
                        System.out.println("4 for ArrayList ");
                        System.out.println("5 for LinkList ");
                        System.out.println("6 for HashSet ");
                        System.out.println("7 for Enumeration Cursor");
                        System.out.println("8 for exit in Collection framework");
                        System.out.println("Enter Your collection framework choice : ");
                        int cfchoice=sc.nextInt();
                        switch (cfchoice)
                        {
                            case 1:
                                ListClass.mainClassOfList();
                                break;
                            case 2:
                                SetClass.mainSetClass();
                                break;
                            case 3:
                                CollectionMethods.mainAllCollectionMethod();
                                break;
                            case 4:
                                ArrayListClass.mainArrayListClass();
                                break;
                            case 5:
                                LinkListClass.mainLinkListClass();
                                break;
                            case 6:
                                HashSetClass.mainHashSetClass();
                                break;
                            case 7:
                                EnumrationCursor.mainEnumrationCursor();
                                break;
                            case 8:
                                break collectionLable;
                        }
                    }
                    break ;
                case 4:
                    sdLable:
                    while (true)
                    {
                        System.out.println("1 for Serialization");
                        System.out.println("2 for Deserialization");
                        System.out.println("3 for Serialization and Deserialization exit");
                        System.out.println("Enter your Serialization and deSerialization choice");
                        int sdchoice=sc.nextInt();
                        switch (sdchoice)
                        {
                            case 1:
                                SerializationEx.serialization();
                                break;
                            case 2:
                                DeSerializationEx.deSerialization();
                                break;
                            case 3:
                                break sdLable;
                        }
                    }
                    break ;
                case 5:
                    rmilable:
                    while (true)
                    {
                        System.out.println("1 for Server Start");
                        System.out.println("2 for Client side ");
                        System.out.println("3 for rmi exit");
                        System.out.println("Enter your rmi choice:");
                        int rmichoice=sc.nextInt();
                        switch (rmichoice)
                        {
                            case 1:
                                Server.server();
                                break;
                            case 2:
                                Client.client();
                                break;
                            case 3:
                                break rmilable;
                        }
                    }
                    break ;
                case 6:
                    break mainLable;
                default:
                    System.out.println("not valid choice ");
            }

        }
    }
}