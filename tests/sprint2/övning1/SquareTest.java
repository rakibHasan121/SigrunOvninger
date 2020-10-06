package sprint2.övning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square s1 = new Square(3, 6);

    @Test
    public final void testGetters() {
        assertEquals(s1.getLength(), 3);
        assertEquals(s1.getWidth(), 6);
        assertNotEquals(s1.getWidth(), 8);
    }

    @Test
    public final void testSetters() {
        s1.setLength(5);
        s1.setWidth(9);
        assertEquals(s1.getWidth(), 9);
        assertNotEquals(s1.getLength(), 1);
    }

    @Test
    public final void testArea() {
        assertEquals(s1.getArea(), 18);
        assertNotEquals(s1.getArea(), 45);
    }

    @Test
    public final void testCircumference() {
        assertEquals(s1.getirCumference(), 18);
        assertTrue(s1.getirCumference()== 18);
    }
}