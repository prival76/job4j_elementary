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

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
              result = i;
              break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[] {0, 2, 4, 9, 5};
        int element = 6;
        System.out.println(indexOf(arrayOfNumbers, element));
        int start = 1;
        int finish = 4;
        System.out.println(indexInRange(arrayOfNumbers, element, start, finish));
    }
}
