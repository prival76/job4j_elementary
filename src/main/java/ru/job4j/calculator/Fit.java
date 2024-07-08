package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short manHeight) {
        return (manHeight - 100) * 1.15;
    }

    public static double womanWeight(short womanHeigt) {
        return  (womanHeigt - 110) * 1.15;

    }

    public static void main(String[] args) {
        short manHeigt = 187;
        short womanHeigt = 162;
        double man = manWeight(manHeigt);
        double woman = womanWeight(womanHeigt);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 162 is " + woman);
    }
}
