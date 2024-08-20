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
        float dollar = rubleToDollar(180);
        String resultDollar = String.format("%.2f", dollar);
        System.out.println("140 rubles are " + resultEuro + " euro");
        System.out.println("180 rubles are " + resultDollar + " dollar");

        float input = 140;
        float expected = 2;
        float output  = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        input = 180;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}


