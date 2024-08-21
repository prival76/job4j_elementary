package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int num = 2; num <= number; num++) {
            result = result * num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(8));
    }
}

