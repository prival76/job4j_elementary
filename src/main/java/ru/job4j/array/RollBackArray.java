package ru.job4j.array;

import java.util.Arrays;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - 1 - index];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        System.out.println("Source array " + Arrays.toString(array));
        System.out.println("New array " + Arrays.toString(rollback(array)));
    }
}
