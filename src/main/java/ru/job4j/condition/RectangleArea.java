package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        return length * height;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        double result1 = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        double result2 = RectangleArea.square(8, 4);
        System.out.println("p = 8, k = 4, s = 2.56, real = " + String.format("%.4f", result2));
    }
}

