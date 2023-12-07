package collection.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetClass {
    public static void mainHashSetClass()
    {
        /**
         * ArrayList Object
         */
        ArrayList arrayList=new ArrayList();
        arrayList.add("nayan");
        arrayList.add("monark");
        arrayList.add("jay");

        /**
         * HashSet
         */
        HashSet hashSet=new HashSet();
        hashSet.add("rahul");
        hashSet.add("jay");
        /**
         * addAll() method
         */
        hashSet.addAll(arrayList);
        System.out.println(hashSet);

        /**
         * remove() and removeAll() methods
         */
        hashSet.remove("jay");
        System.out.println(hashSet);
        //hashSet.removeAll(hashSet);

        /**
         * get Size of HashSet
         */
        System.out.println(hashSet.size());

        System.out.println(hashSet.retainAll(arrayList));


    }
}
