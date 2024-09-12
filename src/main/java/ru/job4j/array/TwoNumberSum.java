package ru.job4j.array;

import java.util.Arrays;

public class TwoNumberSum {
        public static int[] getIndexes(int[] array, int target) {
        int first = 0;
        int second = array.length - 1;
        while (first < second) {
            if (array[first] + array[second] == target) {
                 return new int[] {first, second};
            }
            if (array[first] + array[second] < target) {
                first++;
            } else  {
                second--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {0, 2, 3, 8, 10, 12};
        int target = 15;
        System.out.println(Arrays.toString(TwoNumberSum.getIndexes(array, target)));
    }
}
