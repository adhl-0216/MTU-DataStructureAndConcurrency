package Lab1;

import jdk.jfr.Name;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;



class Q1Test {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("Use an iterator to insert “Ray” after May.")
    void sub2() {
        Q1.sub2();
        String[] expected = {"Kay","Jay","May","Ray","Fay"};
        assertArrayEquals(expected, Q1.getLinkedList().toArray() );
    }

    @Test
    @DisplayName("Then delete Jay")
    void sub3() {
        Q1.sub3();
        String[] expected = {"Kay","May","Ray","Fay"};
        assertArrayEquals(expected, Q1.getLinkedList().toArray());
    }

    @Test
    @DisplayName("Use an iterator to display all the names on the list " +
            "from the beginning of the list"
    )
    void sub4Begin() {
        Q1.sub4Begin();
        String expected = "Kay,Jay,May,Fay,";
        String actual = outputStreamCaptor.toString();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Use an iterator to display all the names on the list " +
            "from the end of the list")
    void sub4Last() {
        Q1.sub4Last();
        String expected = "Fay,May,Jay,Kay,";
        String actual = outputStreamCaptor.toString();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Add Kay again. Use an iterator to display all the names. Note that duplicates are allowed.")
    void sub5() {
        Q1.sub5();
        String expected = "Kay,May,Ray,Fay,Kay,";
        String actual = outputStreamCaptor.toString();
        assertEquals(expected, actual);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}