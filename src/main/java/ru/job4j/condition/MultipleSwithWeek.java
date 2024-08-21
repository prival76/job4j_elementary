package ru.job4j.condition;

public class MultipleSwithWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int name = numberOfDay("Monday");
        System.out.println(name);
        name = numberOfDay("Четверг");
        System.out.println(name);
        name = numberOfDay("Sunday");
        System.out.println(name);
        name = numberOfDay("Лысый хер");
        System.out.println(name);
    }
}
