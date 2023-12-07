package collection.framework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionMethods {
    public static void mainAllCollectionMethod()
    {
        /**
         * Create Array list object and add element using add() method
         */
        ArrayList arrayList=new ArrayList();
        arrayList.add(100);
        arrayList.add(300);
        arrayList.add(400);
        System.out.println(arrayList);

        List list=new ArrayList();
        list.add("Technous");
        list.add("Infosys");
        System.out.println(list);

        /**
         * Add all element in other object using addAll() method
         */
        arrayList.addAll(list);
        System.out.println(arrayList);

        /**
         * remove element using remove() method
         */
        arrayList.remove(0);
        arrayList.remove("Infosys");
        System.out.println(arrayList);

        /**
         * check element using contains
         */
        System.out.println(arrayList.contains(300));

        /**
         * Check two Object element same or not using containsAll() method
         */
        List list1=new ArrayList();
        list1.addAll(arrayList);
        System.out.println(arrayList.containsAll(list1));

        /**
         * Check ArrayList is empty or not using isEmpty() method
         */
        System.out.println(arrayList.isEmpty());

        /**
         * Remove all element in any list
         */
        arrayList.clear();
        System.out.println(arrayList);
    }
}
