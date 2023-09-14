package Lab1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q2 {
    public static void main(String[] args) {

        String[] names = {"Kay","Jay","May","Fay"};

        Set<String> set = new HashSet<>(Arrays.asList(names));

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("=".repeat(10));

        set = new TreeSet<>(Arrays.asList(names));

        for (String s :
                set) {
            System.out.println(s);
        }
    }
}
