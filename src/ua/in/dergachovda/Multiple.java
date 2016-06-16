package ua.in.dergachovda;

public class Multiple {

    private int value;
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";

    Multiple(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(new Multiple(i));
        }
    }

    private boolean isMultipleOf(int denominator) {
        return this.value % denominator == 0;
    }

    public String toString() {

        if (isMultipleOf(15)) {
            return FIZZ + BUZZ;
        }

        if (isMultipleOf(3)) {
            return FIZZ;
        }

        if (isMultipleOf(5)) {
            return BUZZ;
        }

        return Integer.toString(value);
    }
}