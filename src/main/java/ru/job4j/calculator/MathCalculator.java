package ru.job4j.calculator;

import static ru.job4j.calculator.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumMinusAndDivision(double first, double second) {
        return minus(first, second) + division(first, second);
    }

    public static double sumAllTransaction(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + minus(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат второго расчета равен: " + sumMinusAndDivision(10, 20));
        System.out.println("Результат суммы всех вычислений равен: " + sumAllTransaction(10, 20));
    }
}

