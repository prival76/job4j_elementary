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
        short manHeigt = 187;
        short womanHeigt = 162;
        double man = manWeight(manHeigt);
        double woman = womanWeight(womanHeigt);
        System.out.println(String.format("Man 187 cm is %.2f kg", man));
        System.out.println(String.format("Woman 162 cm is %.2f kg", woman));
    }
}
