package ua.in.dergachovda;
//        Напишите программу, которая выводит на экран числа от 1 до 100.
//        При этом вместо чисел, кратных трем, программа должна выводить слово Fizz,
//        а вместо чисел, кратных пяти — слово Buzz. Если число кратно пятнадцати,
//        то программа должна выводить слово FizzBuzz.
//        Задача может показаться очевидной,
//        но нужно получить наиболее простое и красивое решение.

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