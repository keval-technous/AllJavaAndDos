package collection.framework;
import java.util.Collection;
import java.util.LinkedList;

public class LinkListClass {
    public static void mainLinkListClass()
    {
        /**
         * Two types of LinkedList constructor
         */
        LinkedList linkedList=new LinkedList();
        linkedList.add("apple");
        linkedList.add("banana");

        System.out.println(linkedList);

        /**
         * get first and last element
         */
        System.out.println("Get First element : "+linkedList.getFirst());
        System.out.println("Get Last element : "+linkedList.getLast());
        System.out.println("Add first element : ");
        linkedList.addFirst("orange");
        System.out.println("Add first element :"+linkedList);

        System.out.println("Add last element : ");
        linkedList.addLast("painepal");
        System.out.println(linkedList);

        /**
         * Remove First and last element
         */
        System.out.println("Remove first element : ");
        linkedList.removeFirst();
        System.out.println("Remove first element :"+linkedList);

        System.out.println("Remove last element : ");
        linkedList.removeLast();
        System.out.println("Remove last element :"+linkedList);





    }
}
