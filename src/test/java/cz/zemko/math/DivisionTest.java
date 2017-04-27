package cz.zemko.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {

    @Test
    public void testCompute_positiveNumberMinusPositiveNumber() {
        int result = Division.compute(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void testCompute_negativeNumberMinusPositiveNumber() {
        int result = Division.compute(-10, 2);
        assertEquals(-5, result);
    }

    @Test
    public void testCompute_positiveNumberMinusNegativeNumber() {
        int result = Division.compute(9, -3);
        assertEquals(-3, result);
    }

    @Test
    public void testCompute_negativeNumberMinusNegativeNumber() {
        long result = Division.compute(-16, -4);
        assertEquals(4, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompute_divisionByZero() {
        Division.compute(5, 0);
    }

    @Test
    public void testCompute_zeroDividedByNonZeroNumber() {
        int result = Division.compute(0, 5);
        assertEquals(0, result);
    }
}
