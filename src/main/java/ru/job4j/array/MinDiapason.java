package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 9, 4, 5, 6, 3, 7, 10};
        int start = 1;
        int finish = 6;
        System.out.println(MinDiapason.findMin(array, start, finish));
    }
}
