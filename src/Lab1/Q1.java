package Lab1;

import java.util.*;

public class Q1 {
        private static final String[] names = {"Kay","Jay","May","Fay"};
        private static ListIterator<String> iterator;
        private static final LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(names));

    public static LinkedList<String> getLinkedList() {
        return linkedList;
    }


    public static void sub2(){
        iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("May")) {
                iterator.add("Ray");
            }
        }

        System.out.println(linkedList);
    }

    public static void sub3() {
        iterator = linkedList.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals("Jay")) {
                iterator.remove();
            }
        }

        System.out.println(linkedList);
    }

    public static void sub4Begin(){
        iterator = linkedList.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }


    }

    public static void sub4Last(){
        Iterator<String> descendingIterator = linkedList.descendingIterator();

        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + ",");
        }

    }

    public static void sub5(){
        linkedList.add("Kay");

        iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.printf(iterator.next() + ",");
        }
    }


}
