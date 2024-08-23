package ru.job4j.loop;

public class ChekPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(8));

        }
}
