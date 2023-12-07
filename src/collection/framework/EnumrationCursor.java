package collection.framework;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class EnumrationCursor {
    public static void mainEnumrationCursor()
    {
        Vector v=new Vector();
        v.add(200);
        v.add(300);
        System.out.println(v);
        Enumeration enumeration=v.elements();
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
    }
}
