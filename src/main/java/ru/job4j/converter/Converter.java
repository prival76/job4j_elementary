package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        String resultEuro = String.format("%.2f", euro);
        float dollar = rubleToDollar(140);
        String resultDollar = String.format("%.2f", dollar);
        System.out.println("140 rubles are " + resultEuro + " euro");
        System.out.println("140 rubles are " + resultDollar + " dollar");
    }
}
