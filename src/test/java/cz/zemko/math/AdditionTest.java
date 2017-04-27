package cz.zemko.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for testing {@link Addition}.
 *
 * @author Zoltan Zemko
 */
public class AdditionTest {

    @Test
    public void testCompute_zeroPlusZero() {
        long result = Addition.compute(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testCompute_positiveNumberPlusPositiveNumber() {
        long result = Addition.compute(5, 7);
        assertEquals(12, result);
    }

    @Test
    public void testCompute_negativeNumberPlusPositiveNumber() {
        long result = Addition.compute(-5, 7);
        assertEquals(2, result);
    }

    @Test
    public void testCompute_positiveNumberPlusNegativeNumber() {
        long result = Addition.compute(3, -8);
        assertEquals(-5, result);
    }

    @Test
    public void testCompute_negativeNumberPlusNegativeNumber() {
        long result = Addition.compute(-4, -3);
        assertEquals(-7, result);
    }
}
