package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i <= prefix.length - 1; i++) {
            if (prefix[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'G', 'o', 'o', 'o', 'd', ' ', 'L', 'u', 'c', 'k'};
        char[] prefix = {'G', 'o', 'o', 'd'};
        System.out.println(startsWith(word, prefix));
    }
}
