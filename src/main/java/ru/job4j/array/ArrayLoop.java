package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] functionValue = new int[5];
        for (int i = 0; i < functionValue.length; i++) {
            functionValue[i] = i * 2 + 3;
        }
        for (int number: functionValue) {
            System.out.println(number);
        }
    }
}
