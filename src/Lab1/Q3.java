package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
//        Set<String> set = new TreeSet<>();
        Set<String> set = new HashSet<>();
        String fileName = "src/Lab1/hamlet.txt";

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    set.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(set);
        System.out.println(set.size());
    }
}
