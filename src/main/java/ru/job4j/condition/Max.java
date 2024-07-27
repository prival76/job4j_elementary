package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result;
        result = left >= right ? left : right;
        return  result;
    }

    public static void main(String[] args) {
        int left = 8;
        int right = 4;
        int result = Max.max(left, right);
        System.out.println("Maximum number: " + result);
    }
}

