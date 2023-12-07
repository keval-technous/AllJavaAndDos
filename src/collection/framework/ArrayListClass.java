package collection.framework;
import java.util.ArrayList;
import java.util.Collection;
public class ArrayListClass {
    public static void mainArrayListClass()
    {
        /**
         * Type of constructor
         * There are three type of constructor
         *
         */
        /**
         * Default constructor ,this is constructor first initialCapacity is 10
         * Second constructor is set a initialCapacity
         * And last one is Collection object pass
         */
        ArrayList arrayList=new ArrayList();
        arrayList.add(20);
        arrayList.add("Hello world");
        arrayList.add(2,"gvp");

        System.out.println("ArrayList"+arrayList);

        /**
         * addAll() method
         */
        ArrayList arrayList1=new ArrayList(arrayList);
        arrayList1.add("30");
        arrayList1.addAll(arrayList);
        System.out.println("Combine ArrayList"+arrayList);

        /**
         * set() method
         */
        arrayList.set(2,"Technous");
        System.out.println("Update element at 2 index : "+arrayList);

        /**
         * get() method
         */
        System.out.println("Get element at 1 index : "+arrayList.get(1));

        /**
         * contains() method and containsAll
         */
        System.out.println("Check contains : "+arrayList.contains("Technous"));
        System.out.println("Check All contains arrayList and arrayList1 : "+arrayList.containsAll(arrayList1));

        /**
         * isEmpty
         */
        System.out.println("ArrayList is Empty ? : "+arrayList.isEmpty());

        /**
         *sizeOf
         */
        System.out.println(arrayList);
        System.out.println("Get Size : "+arrayList.size());

        /**
         * indexOf
         */
        System.out.println("Index of Technous element : "+arrayList.indexOf("Technous"));

        /**
         * remove() method
         */
        arrayList.remove(0);
        System.out.println("Only one element remove");
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);

        /**
         * clear() method
         */
        System.out.println(arrayList1);
        arrayList1.clear();
        System.out.println(arrayList1);

    }
}
