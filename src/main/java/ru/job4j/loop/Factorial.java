package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result;
        if (number == 0 || number == 1) {
           result = 1;
        return result;
        }
        if (number < 0) {
            result = number;
            System.out.print("Факториал данного числа нельзя вычислить.");
            return  result;
        }
        result = 1;
        for (int num = result; num <= number; num++) {
            result = result * num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(-5));
    }
}
