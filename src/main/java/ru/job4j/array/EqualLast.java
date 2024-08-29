package ru.job4j.array;

public class EqualLast {
        public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4};
        int[] right = {5, 6, 7, 4};
        System.out.println(check(left, right));
    }
}
