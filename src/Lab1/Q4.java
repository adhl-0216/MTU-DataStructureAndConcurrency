package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Map<String, TreeSet<Integer>> map = new TreeMap<>();
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
                    if (!map.containsKey(word)){
                        TreeSet<Integer> lineNumbers = new TreeSet<>();
                        lineNumbers.add(lineNumber);
                        map.put(word, lineNumbers);
                    }else {
                        map.get(word).add(lineNumber);
                    }
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        System.out.println(map);
    }

}
