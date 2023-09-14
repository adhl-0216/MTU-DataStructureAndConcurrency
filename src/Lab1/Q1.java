package Lab1;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        ListIterator<String> iterator;

        String[] names = {"Kay","Jay","May","Fay","Fay"};

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(names));


//        (i)
        iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("May")) {
                iterator.add("Ray");
            }
        }

        System.out.println(linkedList);


//        (ii)
        iterator = linkedList.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals("Jay")) {
                iterator.remove();
            }
        }

        System.out.println(linkedList);

//        (iii)

        iterator = linkedList.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
        System.out.println();

//        (iv)

        Iterator<String> descendingIterator = linkedList.descendingIterator();

        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + ",");
        }
        System.out.println();

//        (v)
        linkedList.add("Kay");

        iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.printf(iterator.next() + ",");
        }
    }
}
