package cz.zemko.math;

/**
 * Provides division operation.
 *
 * @author Zoltan Zemko
 */
public final class Division {

    private Division() {
        // Can't be instantiated.
    }

    /**
     * Compute division of two values. In case when divisor equals to zero throws {@link IllegalArgumentException}.
     *
     * @param a value
     * @param b value
     * @return a divided by b.
     */
    public static int compute(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Divisor is 0.");
        }

        return a / b;
    }
}
