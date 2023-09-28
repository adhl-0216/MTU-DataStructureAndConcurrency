package Lab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private CP3LinkedList list;
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        list = new CP3LinkedList();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
    }

    @Test
    void size() {
        assertEquals(4,list.size());
    }

    @Test
    void sizeEmpty() {
        CP3LinkedList list = new CP3LinkedList();
        assertEquals(0,list.size());
    }

    @Test
    void contains() {
        assertTrue(list.contains("A"));
    }

    @Test
    void addLast() {
        CP3LinkedList list = new CP3LinkedList();
        list.addFirst("D");
        list.addLast("F");
        list.addFirst("C");
        list.print();
        String expected ="CDF";
        assertEquals(expected, outputStreamCaptor.toString());
    }

    @Test
    void removeFirst() {
        list.removeFirst();
        list.print();
        String expected ="CBA";
        assertEquals(expected, outputStreamCaptor.toString());
    }
    @Test
    void removeFirst_whenEmpty() {
        CP3LinkedList list = new CP3LinkedList();
        assertThrows(NoSuchElementException.class, list::removeFirst);

    }
    @Test
    void removeLast() {
        list.removeLast();
        list.print();
        String expected ="DCB";
        assertEquals(expected, outputStreamCaptor.toString());
    }
    @Test
    void removeLast_whenEmpty() {
        CP3LinkedList list = new CP3LinkedList();
        assertThrows(NoSuchElementException.class, list::removeLast);
//        String expected ="DCB";
//        assertEquals(expected, outputStreamCaptor.toString());
    }
}