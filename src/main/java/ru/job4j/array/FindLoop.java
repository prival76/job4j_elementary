package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[] {0, 2, 5, 7, 9};
        int element = 9;
        System.out.println(indexOf(arrayOfNumbers, element));
    }
}
