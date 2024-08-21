package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPossitive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPossitive(int num) {
        if (num == 0) {
            return false;
        }
        return !isPossitive(num);
    }

    public static boolean notEvenAndPossitive(int num) {
        return notEven(num) && isPossitive(num);
    }

    public static boolean evenOrNotPossitive(int num) {
        return isEven(num) || notPossitive(num);
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(LogicNot.isEven(num));
        System.out.println(LogicNot.isPossitive(num));
        System.out.println(LogicNot.notEven(num));
        System.out.println(LogicNot.notPossitive(num));
        System.out.println(LogicNot.notEvenAndPossitive(num));
        System.out.println(LogicNot.evenOrNotPossitive(num));
    }
}

