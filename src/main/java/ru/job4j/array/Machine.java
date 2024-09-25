package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        money = money - price;
        for (int coin : coins) {
            while (money >= coin) {
                result[size++] = coin;
                money -= coin;
            }
        }
        return Arrays.copyOf(result, size);
    }

    public static void main(String[] args) {
        int money = 75;
        int price = 32;
        System.out.println(Arrays.toString(Machine.change(money, price)));
    }
}