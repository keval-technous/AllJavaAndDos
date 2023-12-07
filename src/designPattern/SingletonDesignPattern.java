package designPattern;

/**
 * Singleton Design pattern
 * What is use of Singleton design pattern?
 * Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine
 */
public class SingletonDesignPattern {
    private static SingletonDesignPattern sp=null;
    private SingletonDesignPattern() {}
    public static SingletonDesignPattern getInstance()
    {

        if (sp==null)
        {
            synchronized (SingletonDesignPattern.class)
            {
                sp=new SingletonDesignPattern();
            }
        }
        return sp;
    }
}
