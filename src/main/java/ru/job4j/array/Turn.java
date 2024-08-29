package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] reversArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(back(reversArray)));
    }
}
