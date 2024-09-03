package ru.job4j.array;

public class EndWith {
    public static boolean endWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - 1 - i] != postfix[postfix.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'G', 'o', 'o', 'o', 'd', ' ', 'L', 'u', 'c', 'k'};
        char[] postfix = {'L', 'u', 's', 'k'};
        System.out.println(endWith(word, postfix));
    }
}
