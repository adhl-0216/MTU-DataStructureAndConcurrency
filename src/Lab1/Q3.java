package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
//        Set<String> set = new TreeSet<>();
        private static final Set<String> set = new HashSet<>();

        public static Set<String> getSet(){
            return set;
        }

    public static void q3(){
            try {
                String fileName = "src/Lab1/hamlet.txt";
                Scanner in = new Scanner(new File(fileName));
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
