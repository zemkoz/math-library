package cz.zemko.math;

/**
 * Provides additional operation.
 *
 * @author Zoltan Zemko
 */
public final class Addition {

    private Addition() {
        // Can't be instantiated.
    }

    /**
     * Compute sum of two values.
     *
     * @param a value
     * @param b value
     * @return sum of a and b value.
     */
    public static int compute(int a, int b) {
        return a + b;
    }
}
