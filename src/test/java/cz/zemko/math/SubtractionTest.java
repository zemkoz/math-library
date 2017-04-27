package cz.zemko.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {

    @Test
    public void testCompute_zeroMinusZero() {
        long result = Subtraction.compute(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testCompute_positiveNumberMinusPositiveNumber() {
        long result = Subtraction.compute(5, 7);
        assertEquals(-2, result);
    }

    @Test
    public void testCompute_negativeNumberMinusPositiveNumber() {
        long result = Subtraction.compute(-5, 7);
        assertEquals(-12, result);
    }

    @Test
    public void testCompute_positiveNumberMinusNegativeNumber() {
        long result = Subtraction.compute(3, -8);
        assertEquals(11, result);
    }

    @Test
    public void testCompute_negativeNumberMinusNegativeNumber() {
        long result = Subtraction.compute(-4, -7);
        assertEquals(3, result);
    }
}
