package collection.framework;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {
    public static void mainSetClass()
    {
        Set set=new HashSet();
        set.add(200);
        set.add(300);
        set.add("gvp");

        System.out.println(set);

        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
