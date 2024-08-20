package ru.job4j.calculator;

/**
 * Класс для вычисления идеального веса мужчин и женщин.
 */

public class Fit {

    /**
     * Вычисляет идеальный вес для мужчины
     * @param manHeight рост мужчины в сантиметрах.
     * @return идеальный вес в килограммах.
     */

    public static double manWeight(short manHeight) {
        if (manHeight <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        return (manHeight - 100) * 1.15;
    }

    /**
     * Вычисляет идеальный вес для женщины
     * @param womanHeigt рост женщины в сантиметрах.
     * @return идеальный вес в килограммах.
     */
    public static double womanWeight(short womanHeigt) {
        if (womanHeigt <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        return  (womanHeigt - 110) * 1.15;

    }

    /**
     * Тестовый метод.
     * @param args аргументы коммандной строки.
     */

    public static void main(String[] args) {
        short manHeigt = 180;
        short womanHeigt = 168;
        double man = manWeight(manHeigt);
        double woman = womanWeight(womanHeigt);
        System.out.printf("Man 180 cm is %.2f kg%n", man);
        System.out.printf("Woman 168 cm is %.2f kg%n", woman);
    }
}

