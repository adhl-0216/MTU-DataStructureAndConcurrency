package Lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    void q3() {
        Q3.q3();
        assertEquals(34, Q3.getSet().size());
    }
}