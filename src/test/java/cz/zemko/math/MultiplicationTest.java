package cz.zemko.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for testing {@link Multiplication}.
 *
 * @author Zoltan Zemko
 */
public class MultiplicationTest {

    @Test
    public void testCompute_zeroMultiplyZero() {
        long result = Multiplication.compute(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testCompute_nonZeroNumberMultiplyZero() {
        long result = Multiplication.compute(5, 0);
        assertEquals(0, result);
    }

    @Test
    public void testCompute_zeroNumberMultiplyNonZeroNumber() {
        long result = Multiplication.compute(0, 15);
        assertEquals(0, result);
    }

    @Test
    public void testCompute_positiveNumberMinusPositiveNumber() {
        long result = Multiplication.compute(5, 7);
        assertEquals(35, result);
    }

    @Test
    public void testCompute_negativeNumberMinusPositiveNumber() {
        long result = Multiplication.compute(-5, 7);
        assertEquals(-35, result);
    }

    @Test
    public void testCompute_positiveNumberMinusNegativeNumber() {
        long result = Multiplication.compute(3, -8);
        assertEquals(-24, result);
    }

    @Test
    public void testCompute_negativeNumberMinusNegativeNumber() {
        long result = Multiplication.compute(-4, -7);
        assertEquals(28, result);
    }
}
