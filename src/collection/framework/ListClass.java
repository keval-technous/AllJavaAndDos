package collection.framework;
import java.util.*;

public class ListClass {
    public static void mainClassOfList()
    {
        List list=new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);

        /**
         * Element get using Iterator as forward direction
         */
        ListIterator listIterator=list.listIterator(list.size());
        /*while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }*/

        /**
         * Element get using ListIterator using backward direction
         */
        while (listIterator.hasPrevious())
        {
            System.out.println(" : "+listIterator.previous());
        }

        listIterator.set(2);
        System.out.println(list);
    }
}
