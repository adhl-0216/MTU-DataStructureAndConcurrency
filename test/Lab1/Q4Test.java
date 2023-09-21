package Lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class Q4Test {

    @Test
    @DisplayName("\"to occurred in line 1, line 2, line 4")
    void hamletAnalysis() {
        Map<String, TreeSet<Integer>> map = Q4.hamletAnalysis();
        String actual = map.get("to").toString();
        String expected = "[1, 2, 4]";
        assertEquals(expected, actual);
    }
}