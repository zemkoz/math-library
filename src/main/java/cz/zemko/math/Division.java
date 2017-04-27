package cz.zemko.math;

public final class Division {

    private Division() {
        // Can't be instantiated.
    }

    public static int compute(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Divisor is 0.");
        }

        return a / b;
    }
}
