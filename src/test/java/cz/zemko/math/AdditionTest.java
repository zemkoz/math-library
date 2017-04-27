package cz.zemko.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    @Test
    public void testCompute_zeroPlusZero() {
        long result = Addition.compute(0, 0);
        assertEquals(0, result);
    }
}
