package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("Distance between points (0, 0) to (2, 0) = " + String.format("%.3f", result));
        double result2 = Point.distance(1, 3, 4, 7);
        System.out.println("Distance between points (1, 3) to (4, 7) = " + String.format("%.3f", result2));
        double result3 = Point.distance(6, 5, -18, 5);
        System.out.println("Distance between points (6, 5) to (-18, 5) = " + String.format("%.3f", result3));
        double result4 = Point.distance(-10, 22, 4, 5);
        System.out.println("Distance between points (-10, 22) to (4, 5) = " + String.format("%.3f", result4));
    }
}

