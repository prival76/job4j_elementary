package ru.job4j.calculator;

public class MathFunction {

    public static int func1(int x) {
        return (x * x) + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double division(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
        int result1 = MathFunction.func1(3);
        int result2 = MathFunction.func2(5);
        int total = result1 + result2;
        System.out.println(total);
        int result3 = MathFunction.func1(100);
        System.out.println(result3);
        double resalt4 = MathFunction.multiply(4.0, 5.0);
        System.out.println(resalt4);
        double resalt5 = MathFunction.sum(5.0, 6.0);
        System.out.println(resalt5);
        double resalt6 = MathFunction.minus(8.0, 3.0);
        System.out.println(resalt6);
        double resalt7 = MathFunction.division(8.0, 4.0);
        System.out.println(resalt7);
    }
}
