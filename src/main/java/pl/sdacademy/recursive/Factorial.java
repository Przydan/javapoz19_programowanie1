package pl.sdacademy.recursive;

public class Factorial {

    public long iteration(long value) {
        long accumulator = 1;
        for (int i = 1; i <= value; i++) {
            accumulator *= i;
        }
        return accumulator;
    }

    public long recursive(long value) {
        if (value == 0) return 1;
        return value * recursive(value -1);
    }
}
