package ua.in.dergachovda;
//        Напишите программу, которая выводит на экран числа от 1 до 100.
//        При этом вместо чисел, кратных трем, программа должна выводить слово Fizz,
//        а вместо чисел, кратных пяти — слово Buzz. Если число кратно пятнадцати,
//        то программа должна выводить слово FizzBuzz.
//        Задача может показаться очевидной,
//        но нужно получить наиболее простое и красивое решение.

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(new Multiple(i));
        }
    }

    private static class Multiple {
        private int value;

        Multiple (int value) {
            this.value = value;
        }

        private boolean isMultipleOf (int denominator) {
            return this.value % denominator == 0;
        }

        public String toString() {
            String out = "";

            if (isMultipleOf(3) || isMultipleOf(5)) {
                if (isMultipleOf(3)) {
                    out += "Fizz";
                }
                if (isMultipleOf(5)) {
                    out += "Buzz";
                }
            } else {
                out = Integer.toString(value);
            }

            return out;
        }
    }
}
