package ru.job4j.loop;

public class ChekPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1 || number == 0 || number < 0) {
            prime = false;
            return prime;
        }
            int numberOfDivision = 1;
            for (int i = 1; i <= number - 1; i++) {
                if (number % i == 0) {
                    numberOfDivision += 1;
                }
                if (numberOfDivision > 2) {
                    prime = false;
                    break;
                }

            }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(27));

        }
}
