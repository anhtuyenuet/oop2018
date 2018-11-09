package week2.task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

    private Fraction fraction1;
    private Fraction fraction2;

    @Before
    public void init() {
        fraction1 = new Fraction(2, 3);
        fraction2 = new Fraction(4, 5);
    }

    @Test
    public void testEquals() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction fraction3 = new Fraction(4, 6);

        assertEquals(fraction1, fraction2);
        assertEquals(fraction1, fraction3);
    }

}
